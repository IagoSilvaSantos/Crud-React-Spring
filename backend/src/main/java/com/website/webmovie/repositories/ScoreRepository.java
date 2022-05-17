package com.website.webmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.webmovie.entities.Score;
import com.website.webmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
