package ro.fasttrackit.curs21homework.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21homework.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
