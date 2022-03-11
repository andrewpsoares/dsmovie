package com.andrew.dsmovie.service;

import com.andrew.dsmovie.config.ObjMapperConfig;
import com.andrew.dsmovie.dto.MovieDto;
import com.andrew.dsmovie.domain.model.Movie;
import com.andrew.dsmovie.domain.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDto> findAll(Pageable pageable){
        Page<Movie> movie = movieRepository.findAll(pageable);
        return movie.map(MovieDto::new);
    }

    @Transactional(readOnly = true)
    public Optional<MovieDto> findById(Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            Movie movieObj = movie.get();
            return Optional.of(ObjMapperConfig.map(movieObj, MovieDto.class));
        }else {
            return Optional.empty();
        }
    }
}
