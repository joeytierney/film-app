package com.filmApp.FilmFactory;

public class NightmareOnElmStreet extends Movie {
	
	@Override
	public Cast getCast() {
		String[] names = {"Ronee Blakley", "Robert Englund"};
		String[] charNames = {"Marge Thompson", "Fred Krueger"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Wes Craven", "Wes Craven"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("A Nightmare On Elm Street", "16 November 1984", 2, photos);
	}

}
