package com.filmApp.FilmFactory;

public class InitFilms {
	
	// create Vector array to store all film objects

	public void initFilms() {
		
			AbstractFactory castFactory = FactoryProducer.getFactory("cast");
			AbstractFactory filmFactory = FactoryProducer.getFactory("film");
			AbstractFactory crewFactory = FactoryProducer.getFactory("crew");
			
			Cast cast1 = castFactory.getCast("actor", "Christian Bale", "Bruce Wayne");
			
			System.out.println("Charactrer name: " + cast1.getCharacterName());
			System.out.println("Actor name: " + cast1.getName());
			
			Film film1 = filmFactory.getFilm("Action", "The Dark Knight", "18/07/2008");
			
			System.out.println("Title: " + film1.getTitle());
			System.out.println("Release Date: " + film1.getReleaseDate());

			Crew crew1 = crewFactory.getCrew("writer", "Jonathan Nolan");
			Crew crew2 = crewFactory.getCrew("director",  "Christopher Nolan");
			
			System.out.println("Director: " + crew2.getName());
			System.out.println("Writer: " + crew1.getName());
	}

}
