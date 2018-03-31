package com.filmApp.FilmFactory;

public class CrewFactory extends AbstractFactory {

	@Override
	Cast getCast(String castType, String name, String character) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Crew getCrew(String crewType, String name) {
		if(name.equalsIgnoreCase(null)) {
			return null;
		}
		
		if(crewType.equalsIgnoreCase("director")) {
			return new Director(name);
		} else if(crewType.equalsIgnoreCase("writer")) {
			return new Writer(name);
		}
		return null;
	}

	@Override
	Film getFilm(String filmGenre, String title, String releaseDate) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
