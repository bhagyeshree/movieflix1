package com.movieflix.repsitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.movieflix.entities.CommentEntity;
import com.movieflix.entities.MovieEntity;
import com.movieflix.entities.UserEntity;

@Repository
public class CommentRepositoryImpl implements CommentRepository
{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CommentEntity> showAll()
	{

		TypedQuery<CommentEntity> query = entityManager.createNamedQuery(
				"CommentEntity.showAllComments", CommentEntity.class);
		return query.getResultList();

	}

	@Override
	public List<CommentEntity> showMovieComments(String mid)
	{

		TypedQuery<CommentEntity> query = entityManager.createNamedQuery(
				"CommentEntity.showCommentsByMovie", CommentEntity.class);
		query.setParameter("mid", mid);
		return query.getResultList();
		// TODO Auto-generated method stub
		// return null;
	}

	@Override
	public CommentEntity createComment(String userId, String movieId,
			CommentEntity entity)
	{
		UserEntity user = entityManager.find(UserEntity.class, userId);
		MovieEntity movieEntity = entityManager
				.find(MovieEntity.class, movieId);
		entity.setUser(user);
		entity.setMovieEntity(movieEntity);
		entityManager.persist(entity);
		return entity;

		// TODO Auto-generated method stub

	}

}
