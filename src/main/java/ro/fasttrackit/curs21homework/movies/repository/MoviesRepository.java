package ro.fasttrackit.curs21homework.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21homework.movies.model.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}