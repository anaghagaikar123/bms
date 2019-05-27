package com.bms.service;

import java.util.List;

import com.bms.dto.MovieDTO;
import com.bms.module.Movie;


public interface BmsService {
	
	public void print();

	public void addMovie(MovieDTO movieDTO);

	public List<Movie> getAllMovies();

	public void updateMovie(Long id , String name);

	public Movie getMovie(Long id);

}
