package com.melihawci.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
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
	public MovieResponseDTO save(@RequestBody MovieRequestDTO movieRequestDTO) {
		
		return movieService.save(movieRequestDTO);
	}
	
}
