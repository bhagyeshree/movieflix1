package com.movieflix.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movieflix.entities.MovieEntity;
import com.movieflix.service.MovieService;

@RestController
public class MovieController
{

	@Autowired
	private MovieService service;

	@PersistenceContext
	private EntityManager entityManager;

	@RequestMapping(method = RequestMethod.GET, value = "/movie/titles")
	public List<MovieEntity> showAllMovies()
	{
		return service.showAllMovies();
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/movie/titles/{id}")
	public MovieEntity showOneMovie(@PathVariable("id") String mid)
	{
		return service.showOneMovie(mid);
	}


	@RequestMapping(method = RequestMethod.POST, value = "/movie/admin/titles")
	public MovieEntity createMovie(@RequestBody MovieEntity movieEntity)
	{
		return service.createMovie(movieEntity);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/movie/admin/titles/{id}")
	public MovieEntity updateMovie(@PathVariable("id") String mid,
			@RequestBody MovieEntity movieEntity)
	{
		return service.updateMovie(mid, movieEntity);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/movie/admin/titles/{id}")
	public void deleteMovie(@PathVariable("id") String mid)
	{
		service.deleteMovie(mid);
	}
	


}
