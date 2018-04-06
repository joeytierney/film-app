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
		String[] photos = {"images/darkKnight/dk1.jpg", "images/darkKnight/dk2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/darkKnight/dkPoster.jpg", "The Dark Knight", "18 July 2008", 2, photos, "2h 32min", "$185,000,000 (estimated)", "$1,004,558,444, 19 July 2012", "Set within a year after the events of Batman Begins, Batman, Lieutenant James Gordon, and new district attorney Harvey Dent successfully begin to round up the criminals that plague Gotham City until a mysterious and sadistic criminal mastermind known only as the Joker appears in Gotham, creating a new wave of chaos. Batman's struggle against the Joker becomes deeply personal, forcing him to \"confront everything he believes\" and improve his technology to stop him. A love triangle develops between Bruce Wayne, Dent and Rachel Dawes.");
	}

}
