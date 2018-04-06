package com.filmApp.FilmFactory;

public class Simpsons extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Dan Castellaneta", "Julie Kavner"};
		String[] charNames = {"Homer Simpson", "Marge Simpson"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"David Silverman", "James L. Brooks"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/simpsons/simpsons1.jpg", "images/simpsons/simpsons2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/simpsons/simpsonsPoster.jpg", "The Simpsons Movie", "27 July 2007", 2, photos, "1h 27min", "$75,000,000 (estimated)", "$526,745,137", "Homer adopts a pig who's run away from Krusty Burger after Krusty tried to have him slaughtered, naming the pig \"Spider Pig.\" At the same time, the lake is protected after the audience sink the barge Green Day are on with garbage after they mention the environment. Meanwhile, Spider Pig's waste has filled up a silo in just 2 days, apparently with Homer's help. Homer can't get to the dump quickly so dumps the silo in the lake, polluting it. Russ Cargill, the villainous boss of the EPA, gives Arnold Schwarzenegger, president of the USA, 5 options and forces him to choose 4 (which is, unfortunately, to destroy Springfield) and putting a dome over Springfield to prevent evacuation. Homer, however, has escaped, along with his family. Can he stop the evil Cargill from annihilating his home town, and his family, who have been forced to return to Springfield?");
	}

}
