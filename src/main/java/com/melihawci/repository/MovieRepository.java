package com.melihawci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melihawci.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
