package com.melihawci.services;

import java.util.List;
import java.util.Optional;

import com.melihawci.dto.MovieRequestDTO;
import com.melihawci.dto.MovieResponseDTO;
import com.melihawci.dto.MovieUpdateDTO;

public interface IMovieService 
{

	public MovieResponseDTO save(MovieRequestDTO movieRequestDTO);
	
	public Optional<MovieResponseDTO> findById(Long id);
	
	public List<MovieResponseDTO> findAll();
	
	public MovieResponseDTO update(Long id, MovieUpdateDTO movieUpdateDTO);
	
	public void deleteById(Long id);

}
