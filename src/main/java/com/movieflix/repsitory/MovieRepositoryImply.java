package com.movieflix.repsitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.movieflix.entities.MovieEntity;

@Repository
public class MovieRepositoryImply implements MovieRepository
{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<MovieEntity> showAllMovies()
	{
		TypedQuery<MovieEntity> query = entityManager
				.createNamedQuery("MovieEntity.findAll", MovieEntity.class);
		return query.getResultList();
	}

	@Override
	public MovieEntity createMovie(MovieEntity movieEntity)
	{
		entityManager.persist(movieEntity);
		return movieEntity;
	}

	@Override
	public MovieEntity updateMovie(MovieEntity movieEntity)
	{
		return entityManager.merge(movieEntity);
	}

	@Override
	public void deleteMovie(String id)
	{
		MovieEntity me = entityManager.find(MovieEntity.class, id);
		entityManager.remove(me);

	}


	@Override
	public MovieEntity showOneMovie(String mid)
	{
		return entityManager.find(MovieEntity.class, mid);
	}

}
