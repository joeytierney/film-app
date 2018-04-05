package com.filmApp.FilmFactory;

public class ActionMovieStore extends MovieStore {

	@Override
	Movie createMovie(String item) {
		if(item.equalsIgnoreCase("Fight Club")) {
			return new FightClub();
		} else if(item.equalsIgnoreCase("Inception")) {
			return new Inception();
		} else if(item.equalsIgnoreCase("The Lord of the Rings")) {
			return new LordOfTheRings();
		} else if(item.equalsIgnoreCase("The Dark Knight")) {
			return new TheDarkKnight();
		} else {
			return null;
		}
	}

}
