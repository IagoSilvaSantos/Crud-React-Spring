package com.website.webmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.website.webmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
