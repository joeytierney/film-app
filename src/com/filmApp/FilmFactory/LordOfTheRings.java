package com.filmApp.FilmFactory;

public class LordOfTheRings extends Movie {

	@Override
	public Cast getCast() {
		String[] names = {"Orlando Bloom", "Sean Bean"};
		String[] charNames = {"Legolas", "Boromir"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Peter Jackson", "J.R.R. Tolkien"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		return new FilmDetails("The Lord of the Rings", "17 December 2003");
	}
}
