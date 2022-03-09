package com.andrew.dsmovie.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ScoreDto {
    private Long movieId;
    private String email;
    private Double score;
}
