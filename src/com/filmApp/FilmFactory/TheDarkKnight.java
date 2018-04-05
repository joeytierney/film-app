package com.filmApp.FilmFactory;

public class TheDarkKnight extends Movie{
	

	@Override
	public Cast getCast() {
		String[] names = {"Christian Bale", "Heath Ledger"};
		String[] charNames = {"Bruce Wayne", "Joker"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Christopher Nolan", "Jonathan Nolan"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("The Dark Knight", "18 July 2008", 2, photos);
	}

}
