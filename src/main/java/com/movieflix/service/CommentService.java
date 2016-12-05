package com.movieflix.service;

import java.util.List;

import com.movieflix.entities.CommentEntity;


public interface CommentService
{
	public List<CommentEntity> showAll();

	public List<CommentEntity> showMovieComments(String mid);

	public CommentEntity createComment(String userId, String movieId,
			CommentEntity entity);
}
