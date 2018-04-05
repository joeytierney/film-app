package com.filmApp.FilmFactory;

public class HorrorMovieStore extends MovieStore{

	@Override
	Movie createMovie(String item) {
		if(item.equalsIgnoreCase("Halloween")) {
			return new Halloween();
		} else if(item.equalsIgnoreCase("A Nightmare On Elm Street")) {
			return new NightmareOnElmStreet();
		} else if(item.equalsIgnoreCase("The Omen")) {
			return new Omen();
		} else if(item.equalsIgnoreCase("The Texas Chainsaw Massacre")) {
			return new TexasChainsawMassacre();
		} else {
			return null;
		}
	}

}
