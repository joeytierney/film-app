package com.filmApp.FilmFactory;

public class Inception extends Movie{

	@Override
	public Cast getCast() {
		String[] names = {"Leonardo DiCaprio", "Ellen Page"};
		String[] charNames = {"Cobb", "Ariadne"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Christopher Nolan", "Christopher Nolan"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("Inception", "1 July 2010", 2, photos);
	}

}
