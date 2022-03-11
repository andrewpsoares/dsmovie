package com.andrew.dsmovie.dto;

import com.andrew.dsmovie.domain.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovieDto {
    private Long id;

    @NotBlank
    @Size(min = 3, max = 30)
    private String title;

    private Double score;
    private Integer count;
    private String image;

    public MovieDto(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.score = movie.getScore();
        this.count = movie.getCount();
        this.image = movie.getImage();
    }
}
