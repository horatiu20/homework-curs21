package ro.fasttrackit.curs21homework.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21homework.movies.model.*;
import ro.fasttrackit.curs21homework.movies.repository.ActorRepository;
import ro.fasttrackit.curs21homework.movies.repository.MovieRepository;
import ro.fasttrackit.curs21homework.movies.repository.StudioRepository;

import java.util.List;

/*Create Movie(id:Integer, name:String, year:int) entity.
Create the following relations:
	OneToOne: MovieRating(id:Integer, rating:int, agency:String) -> one movie has a single rating, a rating can refer only to one movie.
	OneToMany: Review(id:Integer, text:String, reviewer:String)  -> one movie has multiple review, a review can refer only one movie.
	ManyToOne: Studio(id:Integer, name:String, address:String)   -> one movie is produced by one studio, a studio can produce multiple movies.
	ManyToMany: Actor(id:Integer, name:String, birthYear:int)    -> one movie has multiple actors in cast, an actor can participate in multiple movies.
Pre-populate the database with various data.
Create a single endpoint that returns all movies save*/

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(MovieRepository repository, StudioRepository studioRepository, ActorRepository actorRepository) {
		return args -> {
			Actor actor1 = actorRepository.save(new Actor("Keanu Reeves", 1964));
			Actor actor2 = actorRepository.save(new Actor("Laurence Fishburne", 1961));
			Actor actor3 = actorRepository.save(new Actor("Carrie-Anne Moss", 1967));
			Actor actor4 = actorRepository.save(new Actor("Timothee Chalamet", 1995));
			Actor actor5 = actorRepository.save(new Actor("Rebecca Ferguson", 1983));
			Actor actor6 = actorRepository.save(new Actor("Oscar Isaac", 1979));
			Actor actor7 = actorRepository.save(new Actor("Jared Harris", 1961));
			Actor actor8 = actorRepository.save(new Actor("Lee Pace", 1979));
			Actor actor9 = actorRepository.save(new Actor("Laura Birn", 1981));
			Actor actor10 = actorRepository.save(new Actor("Henry Cavill", 1983));
			Actor actor11 = actorRepository.save(new Actor("Freya Allan", 2001));
			Actor actor12 = actorRepository.save(new Actor("Anya Chalotra", 1996));
			Studio warnerBrosStudio = studioRepository.save(new Studio("Warner Bros", "USA"));
			Studio legendaryEntertainment = studioRepository.save(new Studio("Legendary Entertainment", "USA"));
			Studio skydanceTelevision = studioRepository.save(new Studio("Skydance Television", "USA"));
			Studio cinesite = studioRepository.save(new Studio("Cinesite", "USA"));

			repository.saveAll(List.of(
					new Movie("The Matrix", 1999, new MovieRating(9, "Village Roadshow Pictures"), listOfReviews1(), warnerBrosStudio, List.of(actor1, actor2, actor3)),
					new Movie("Dune", 2021, new MovieRating(10, "HBO Max"), listOfReviews2(), legendaryEntertainment, List.of(actor4, actor5, actor6)),
					new Movie("Foundation", 2021, new MovieRating(8, "Apple Movies"), listOfReviews3(), skydanceTelevision, List.of(actor7, actor8, actor9)),
					new Movie("The Witcher", 2019, new MovieRating(9, "Netflix"), listOfReviews4(), cinesite, List.of(actor10, actor11, actor12))));
		};
	}

	private List<Review> listOfReviews1() {
		return List.of(
				new Review("very good", "Calin"),
				new Review("good", "Bogdan"),
				new Review("could be better", "Maria"));
	}

	private List<Review> listOfReviews2() {
		return List.of(
				new Review("very good", "Mihai"),
				new Review("good", "Bianca"),
				new Review("the best", "Vlad"));
	}

	private List<Review> listOfReviews3() {
		return List.of(
				new Review("could be better", "Laura"),
				new Review("pretty good", "Raluca"),
				new Review("average", "Paul"));
	}

	private List<Review> listOfReviews4() {
		return List.of(
				new Review("good adaptation", "Claudiu"),
				new Review("good", "Iuliu"),
				new Review("very good", "Ana"));
	}
}
