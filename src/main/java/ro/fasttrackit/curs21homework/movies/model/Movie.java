package ro.fasttrackit.curs21homework.movies.model;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private int year;

	@OneToOne(cascade = ALL)
	private MovieRating movieRating;
	@OneToMany(cascade = ALL)
	private List<Review> reviews;
	@ManyToOne
	private Studio studio;
	@ManyToMany
	private List<Actor> actors;

	Movie() {
	}

	public Movie(String name, int year, MovieRating movieRating, List<Review> reviews, Studio studio, List<Actor> actors) {
		this.name = name;
		this.year = year;
		this.movieRating = movieRating;
		this.reviews = reviews;
		this.studio = studio;
		this.actors = actors;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MovieRating getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(MovieRating movieRating) {
		this.movieRating = movieRating;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
