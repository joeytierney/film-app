package com.filmApp.FilmFactory;

public class Simpsons extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Dan Castellaneta", "Julie Kavner"};
		String[] charNames = {"Homer Simpson", "Marge Simpson"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"David Silverman", "James L. Brooks"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		return new FilmDetails("The Simpsons Movie", "27 July 2007");
	}

}
