package com.movieflix.repsitory;

import com.movieflix.entities.RatingEntity;

public interface RatingRepository
{
	public RatingEntity createRating(String userId, String movieId,
			RatingEntity ratingEntity);

}
