package com.scrumtrek.simplestore;

public class Rental {
	private Movie movie;

	public Rental(Movie testMovie, int i) {
		this.movie = testMovie;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getDaysRented() {
		return 0;
	}
}

