package com.andrew.dsmovie.repository;

import com.andrew.dsmovie.model.Movie;
import com.andrew.dsmovie.model.Score;
import com.andrew.dsmovie.model.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
