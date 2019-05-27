package com.bms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bms.database.MovieDAO;
import com.bms.dto.MovieDTO;
import com.bms.module.Movie;

@Service
@Transactional
public class BmsServiceImpl implements BmsService {

	@Autowired
	MovieDAO movieDAO;

	@Override
	public void print() {
		System.out.println("***home****");
	}

	@Override
	public void addMovie(MovieDTO movieDTO) {
		Movie movie = new Movie();
		if (movieDTO != null) {
			movie.setName((Optional.ofNullable(movieDTO.getName())).orElse(""));
			movieDAO.save(movie);
		}

	}

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movieList = movieDAO.findAll();
		return movieList;
	}

	@Override
	public void updateMovie(Long id, String name) {
		Movie movie = movieDAO.findOne(id);
		if (movie != null) {
			movie.setName((Optional.ofNullable(name)).orElse(""));
			movieDAO.saveOrUpdate(movie);
		}

	}

	@Override
	public Movie getMovie(Long id) {
		Movie movie = movieDAO.findOne(id);
		return Optional.ofNullable(movie).orElse(null);
	}

}
