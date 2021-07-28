package ro.fasttrackit.curs21homework.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21homework.movies.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
