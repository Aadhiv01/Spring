package com.wiley.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.MovieBean;
import com.wiley.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;
	
	@Override
	public MovieBean getMovieById(int id) {
		return movieDao.getById(id);
	}

	@Override
	public Collection<MovieBean> getAllMovies() {
		return movieDao.findAll();
	}

}
