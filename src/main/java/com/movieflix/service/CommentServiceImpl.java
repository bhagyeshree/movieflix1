package com.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieflix.entities.CommentEntity;
import com.movieflix.repsitory.CommentRepository;


@Service
public class CommentServiceImpl implements CommentService
{

	@Autowired
	private CommentRepository repository;

	@Override
	public List<CommentEntity> showAll()
	{
		return repository.showAll();
	}

	@Override
	public List<CommentEntity> showMovieComments(String mid)
	{
		return repository.showMovieComments(mid);
	}

	@Transactional
	@Override
	public CommentEntity createComment(String userId, String movieId,
			CommentEntity entity)
	{
		return repository.createComment(userId, movieId, entity);
	}

}
