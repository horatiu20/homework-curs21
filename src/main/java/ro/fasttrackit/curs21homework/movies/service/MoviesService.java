package ro.fasttrackit.curs21homework.movies.service;

import ro.fasttrackit.curs21homework.movies.model.Movie;
import ro.fasttrackit.curs21homework.movies.repository.MoviesRepository;

import java.util.List;

public class MoviesService {
	private final MoviesRepository repository;

	public MoviesService(MoviesRepository repository) {
		this.repository = repository;
	}

	public List<Movie> getAll() {
		return repository.findAll();
	}
}
