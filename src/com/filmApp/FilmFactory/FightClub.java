package com.filmApp.FilmFactory;

public class FightClub extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Edward Norton", "Brad Pitt"};
		String[] charNames = {"The Narrator", "Tyler Durden"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"David Fincher", " Chuck Palahniuk"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		return new FilmDetails("Fight Club", "15 October 1999");
	}

}
