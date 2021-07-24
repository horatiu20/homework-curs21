package ro.fasttrackit.curs21homework.movies.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.movies.model.Movie;
import ro.fasttrackit.curs21homework.movies.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
	private final MovieRepository repository;

	public MovieService(MovieRepository repository) {
		this.repository = repository;
	}

	public List<Movie> getAll() {
		return repository.findAll();
	}
}
