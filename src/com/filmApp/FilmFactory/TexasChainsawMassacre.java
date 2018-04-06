package com.filmApp.FilmFactory;

public class TexasChainsawMassacre extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Marilyn Burns", "Gunnar Hansen"};
		String[] charNames = {"Sally", "Leatherface"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Tobe Hooper", "Kim Henkel"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/texas/texas1.jpg", "images/texas/texas2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/texas/texasPoster.jpg", "The Texas Chainsaw Massacre", "4 October 1974", 2, photos, "1h 23min", "$300,000 (estimated)", "$30,859,000", "En route to visit their grandfather's grave (which has apparently been ritualistically desecrated), five teenagers drive past a slaughterhouse, pick up (and quickly drop) a sinister hitch-hiker, eat some delicious home-cured meat at a roadside gas station, before ending up at the old family home... where they're plunged into a never-ending nightmare as they meet a family of cannibals who more than make up in power tools what they lack in social skills...");
	}

}
