package ro.fasttrackit.curs21homework.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private int birthYear;

	Actor() {

	}

	public Actor(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Actor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", birthYear=" + birthYear +
				'}';
	}
}
