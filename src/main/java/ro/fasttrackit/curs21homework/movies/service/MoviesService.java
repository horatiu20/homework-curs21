package ro.fasttrackit.curs21homework.movies.service;

import ro.fasttrackit.curs21homework.movies.model.Movies;
import ro.fasttrackit.curs21homework.movies.repository.MoviesRepository;

import java.util.List;

public class MoviesService {
	private final MoviesRepository repository;

	public MoviesService(MoviesRepository repository) {
		this.repository = repository;
	}

	public List<Movies> getAll() {
		return repository.findAll();
	}
}
