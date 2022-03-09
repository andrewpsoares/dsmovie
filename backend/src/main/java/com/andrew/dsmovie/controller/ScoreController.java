package com.andrew.dsmovie.controller;

import com.andrew.dsmovie.dto.MovieDto;
import com.andrew.dsmovie.dto.ScoreDto;
import com.andrew.dsmovie.service.MovieService;
import com.andrew.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PutMapping()
    public MovieDto saveScore(@RequestBody ScoreDto scoreDto){
        return scoreService.saveScore(scoreDto);
    }
}
