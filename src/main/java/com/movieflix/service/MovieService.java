package com.movieflix.service;


import java.util.List;

import com.movieflix.entities.MovieEntity;

public interface MovieService
{
	
	public List<MovieEntity> showAllMovies();

	public MovieEntity showOneMovie(String mid);

	public MovieEntity createMovie(MovieEntity movieEntity);

	public MovieEntity updateMovie(String id, MovieEntity movieEntity);

	public void deleteMovie(String mid);




}
