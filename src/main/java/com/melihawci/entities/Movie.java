package com.melihawci.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie 
{
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "director", nullable = false)
	private String director;
	
	@Column(name = "release_year", nullable = false)
	private Integer releaseYear;
	
	@Column(name = "genre", nullable = false)
	private String genre;
	
	@Column(name = "rating", nullable = false)
	private Double rating;
	
	
}
