package com.filipescaglia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipescaglia.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
