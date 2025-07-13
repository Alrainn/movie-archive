package com.melihawci.controller.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melihawci.controller.IMovieController;
import com.melihawci.dto.MovieRequestDTO;
import com.melihawci.dto.MovieResponseDTO;
import com.melihawci.services.IMovieService;

@RestController
@RequestMapping(path = "/rest/api/movie")
public class MovieControllerImpl implements IMovieController
{

	@Autowired
	private IMovieService movieService;

	@Override
	@PostMapping("/save")
	public MovieResponseDTO save(@RequestBody MovieRequestDTO movieRequestDTO)
	{
		
		return movieService.save(movieRequestDTO);
	}

	@Override
	@GetMapping("/list/{id}")
	public Optional<MovieResponseDTO> findById(@PathVariable(name = "id",required = true) Long id)
	{
		
		return movieService.findById(id);
		
	}

	@Override
	@GetMapping("/list")
	public List<MovieResponseDTO> findAll()
	{
		return movieService.findAll();
	}
	
	
	
}
