package com.movieflix.repsitory;

import java.util.List;

import com.movieflix.entities.MovieEntity;

public interface MovieRepository
{
	public List<MovieEntity> showAllMovies();

	public MovieEntity showOneMovie(String mid);

	public MovieEntity createMovie(MovieEntity movieEntity);

	public MovieEntity updateMovie(MovieEntity movieEntity);

	public void deleteMovie(String id);

}
