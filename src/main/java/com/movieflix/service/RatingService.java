package com.movieflix.service;

import com.movieflix.entities.RatingEntity;

public interface RatingService
{

	public RatingEntity createRating(String userId, String movieId,
			RatingEntity ratingEntity);
}
