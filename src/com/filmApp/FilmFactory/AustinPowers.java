package com.filmApp.FilmFactory;

public class AustinPowers extends Movie {
	
	@Override
	public Cast getCast() {
		String[] names = {"Mike Myers", "Elizabeth Hurley"};
		String[] charNames = {"Austin Powers / Dr. Evil", "Vanessa Kensington"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Jay Roach", "Mike Myers"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("Austin Powers", "2 May 1997", 2, photos);
	}
}
