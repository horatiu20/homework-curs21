package ro.fasttrackit.curs21homework.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.curs21homework.movies.model.Movies;
import ro.fasttrackit.curs21homework.movies.service.MoviesService;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MoviesController {
	public final MoviesService moviesService;

	public MoviesController(MoviesService moviesService) {
		this.moviesService = moviesService;
	}

	@GetMapping
	List<Movies> getAll(){
		return moviesService.getAll();
	}

}
