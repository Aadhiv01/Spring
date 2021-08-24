package com.wiley.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.Rating;
import com.wiley.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingDao ratingDao;
	
	@Override
	public Collection<Rating> getAllRatings() {
		return ratingDao.findAll();
	}

	@Override
	public Rating getRatingByMovieId(int id) {
		return ratingDao.getById(id);
	}

}
