package com.melihawci.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.melihawci.dto.MovieRequestDTO;
import com.melihawci.dto.MovieResponseDTO;
import com.melihawci.entities.Movie;
import com.melihawci.repository.MovieRepository;
import com.melihawci.services.IMovieService;

@Service
public class MovieServiceImpl implements IMovieService
{

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public MovieResponseDTO save(MovieRequestDTO movieRequestDTO) {
	
		if(movieRequestDTO==null)
		{
			return null;
		}
		
		Movie movie = new Movie();
		
		BeanUtils.copyProperties(movieRequestDTO, movie);
		
		Movie savedMovie = movieRepository.save(movie);
		
		MovieResponseDTO responseDTO = new MovieResponseDTO();
		
		responseDTO.setTitle(savedMovie.getTitle());
		
	    responseDTO.setDirector(savedMovie.getDirector());

	    return responseDTO;
		
				
	}

	@Override
	public Optional<MovieResponseDTO> findById(Long id)
	{
		
		Optional<Movie> movieOpt = movieRepository.findById(id);
		
	    if (movieOpt.isPresent())
	    {
	    	
	        Movie movie = movieOpt.get();
	        
	        MovieResponseDTO dto = new MovieResponseDTO();
	        
	        dto.setTitle(movie.getTitle());
	        
	        dto.setDirector(movie.getDirector());
	        
	        return Optional.of(dto);
	        
	    }
	    else
	    {
	        return Optional.empty();
	    }
	}

	@Override
	public List<MovieResponseDTO> findAll() {
		
		return null;
	}

	@Override
	public MovieResponseDTO update(MovieRequestDTO movieRequestDTO) {
		
		return null;
	}

	@Override
	public void deleteById(Long id) {
		
		
	}

}
