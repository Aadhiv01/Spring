package com.wiley.service;

import java.util.Collection;

import com.wiley.bean.Rating;

public interface RatingService {
	public Collection<Rating> getAllRatings();
	public Rating getRatingByMovieId(int id);
}
