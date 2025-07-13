package com.melihawci.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.melihawci.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
