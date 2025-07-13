package com.melihawci.controller;

import com.melihawci.dto.MovieRequestDTO;
import com.melihawci.dto.MovieResponseDTO;

public interface IMovieController 
{

	public MovieResponseDTO save(MovieRequestDTO movieRequestDTO);
}
