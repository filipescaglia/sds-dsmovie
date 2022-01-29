package com.filipescaglia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipescaglia.dsmovie.entities.Score;
import com.filipescaglia.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
