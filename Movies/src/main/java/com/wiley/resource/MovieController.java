package com.wiley.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.MovieBean;
import com.wiley.service.MovieService;
import com.wiley.service.RatingService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	@Autowired
	RatingService ratingService;
	
	@GetMapping(path = "/movies",produces = "Application/json")
	Collection<MovieBean> findAllMovies(){
		return movieService.getAllMovies();
	}
	
	@GetMapping(path="/movies/{mid}",produces = "Application/json")
	MovieBean getMovieById(@PathVariable("mid") int id) {
		return movieService.getMovieById(id);
	}
	
	@GetMapping(path = "/ratings",produces = "Application/json")
	Collection<MovieBean> findAllRatings(){
		return movieService.getAllMovies();
	}
	
	@GetMapping(path="/ratings/{rid}",produces = "Application/json")
	MovieBean getRatingById(@PathVariable("rid") int id) {
		return movieService.getMovieById(id);
	}
}
