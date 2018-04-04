package com.filmApp.FilmFactory;

public class Omen extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Gregory Peck", "Harvey Stephens"};
		String[] charNames = {"Robert Thorn", "Damien"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Richard Donner", " David Seltzer "};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		return new FilmDetails("The Omen", "25 June 1976");
	}

}
