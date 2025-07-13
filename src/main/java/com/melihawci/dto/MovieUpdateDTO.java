package com.melihawci.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieUpdateDTO
{
    private String title;
    
    private String director;
    
    private Integer releaseYear;
    
    private String genre;
    
    private Double rating;
}