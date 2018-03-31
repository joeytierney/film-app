package com.filmApp.FilmFactory;

public class FilmFactory extends AbstractFactory{

	@Override
	Cast getCast(String castType, String name, String character) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Crew getCrew(String crewType, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Film getFilm(String filmGenre, String title, String releaseDate) {
		if(title.equalsIgnoreCase(null)) {
			return null;
		}
		
		if(filmGenre.equalsIgnoreCase("comedy")) {
			return new Comedy(title, releaseDate);
		} else if(filmGenre.equalsIgnoreCase("horror")) {
			return new Horror(title, releaseDate);
		} else if(filmGenre.equalsIgnoreCase("action")) {
			return new Action(title, releaseDate);
		}
		return null;
	}

}
