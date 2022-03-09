package com.andrew.dsmovie.service;

import com.andrew.dsmovie.dto.MovieDto;
import com.andrew.dsmovie.model.Movie;
import com.andrew.dsmovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDto> findAll(Pageable Pageable){
        Page<Movie> movie = movieRepository.findAll(Pageable);
        return movie.map(MovieDto::new);
    }

    @Transactional(readOnly = true)
    public MovieDto findById(Long id){
        Movie movie = movieRepository.findById(id).get();
        return new MovieDto(movie);
    }
}
