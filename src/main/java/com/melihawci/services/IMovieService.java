package com.melihawci.services;

import java.util.List;
import java.util.Optional;

import com.melihawci.dto.MovieRequestDTO;
import com.melihawci.dto.MovieResponseDTO;

public interface IMovieService 
{

	public MovieResponseDTO save(MovieRequestDTO movieRequestDTO);
	
	public Optional<MovieResponseDTO> findById(Long id);
	
	public List<MovieResponseDTO> findAll();
	
	public MovieResponseDTO update(MovieRequestDTO movieRequestDTO);
	
	public void deleteById(Long id);
}
