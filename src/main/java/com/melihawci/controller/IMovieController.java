package com.melihawci.controller;

import java.util.Optional;

import com.melihawci.dto.MovieRequestDTO;
import com.melihawci.dto.MovieResponseDTO;

public interface IMovieController 
{

	public MovieResponseDTO save(MovieRequestDTO movieRequestDTO);
	
	public Optional<MovieResponseDTO> findById(Long id);
}
