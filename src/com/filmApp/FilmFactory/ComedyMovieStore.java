package com.filmApp.FilmFactory;

public class ComedyMovieStore extends MovieStore {

	@Override
	Movie createMovie(String item) {
		if(item.equalsIgnoreCase("Austin Powers")) {
			return new AustinPowers();
		} else if(item.equalsIgnoreCase("The Simpsons Movie")) {
			return new Simpsons();
		} else if(item.equalsIgnoreCase("Team America:World Police")) {
			return new TeamAmerica();
		} else if(item.equalsIgnoreCase("Wayne's World")) {
			return new WaynesWorld();
		} else {
			return null;
		}
	}

}
