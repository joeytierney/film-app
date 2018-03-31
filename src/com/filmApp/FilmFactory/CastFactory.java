package com.filmApp.FilmFactory;

public class CastFactory extends AbstractFactory{

	@Override
	Cast getCast(String castType, String name, String character) {
		if(name.equalsIgnoreCase(null) || character.equalsIgnoreCase(null)) {
			return null;
		}
		
		if(castType.equalsIgnoreCase("actor")) {
			return new Actor(name, character);
		} else if (castType.equalsIgnoreCase("actress")) {
			return new Actress(name, character);
		}
		
		return null;
	}

	@Override
	Crew getCrew(String crewType, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Film getFilm(String filmGenre, String title, String releaseDate) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
