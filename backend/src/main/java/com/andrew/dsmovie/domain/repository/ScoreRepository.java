package com.andrew.dsmovie.domain.repository;

import com.andrew.dsmovie.domain.model.Score;
import com.andrew.dsmovie.domain.model.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
