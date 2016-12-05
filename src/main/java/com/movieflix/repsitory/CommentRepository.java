package com.movieflix.repsitory;

import java.util.List;

import com.movieflix.entities.CommentEntity;

public interface CommentRepository
{

	public List<CommentEntity> showAll();

	public List<CommentEntity> showMovieComments(String cid);

	public CommentEntity createComment(String userId, String movieId,
			CommentEntity entity);
}
