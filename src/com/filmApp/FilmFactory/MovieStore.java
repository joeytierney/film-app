package com.filmApp.FilmFactory;

public abstract class MovieStore {
	
	abstract Movie createMovie(String item);
	
	public Movie orderMovie(String type) {
		Movie movie = createMovie(type);
		return movie;
	}

}
