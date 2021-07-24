package ro.fasttrackit.curs21homework.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.curs21homework.movies.model.Movie;
import ro.fasttrackit.curs21homework.movies.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
	public final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping
	List<Movie> getAll() {
		return movieService.getAll();
	}
}
