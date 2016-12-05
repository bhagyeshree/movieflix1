package com.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieflix.entities.MovieEntity;
import com.movieflix.exception.ResourceNotFoundException;
import com.movieflix.repsitory.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService
{

	@Autowired
	private MovieRepository repository;

	@Override
	public List<MovieEntity> showAllMovies()
	{
		return repository.showAllMovies();
	}

	@Override
	@Transactional
	public MovieEntity createMovie(MovieEntity movieEntity)
	{
		return repository.createMovie(movieEntity);
	}

	@Override
	@Transactional
	public MovieEntity updateMovie(String id, MovieEntity movieEntity)
	{
		return repository.updateMovie(movieEntity);
	}

	@Override
	@Transactional
	public void deleteMovie(String mid)
	{
		repository.deleteMovie(mid);
	}

	@Override
	public MovieEntity showOneMovie(String mid)
	{
		MovieEntity existing = repository.showOneMovie(mid);
		if (existing == null)
		{
			throw new ResourceNotFoundException("No Movies Found with the ID  "
							+ mid);
		}
		return existing;
	}



}
