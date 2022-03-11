package com.andrew.dsmovie.controller;

import com.andrew.dsmovie.domain.model.Movie;
import com.andrew.dsmovie.dto.MovieDto;
import com.andrew.dsmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public Page<MovieDto> findAll(Pageable pageable){
        return movieService.findAll(pageable);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieDto> findById(@PathVariable Long id){
            return movieService.findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }
}
