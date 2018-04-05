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
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("The Texas Chainsaw Massacre", "4 October 1974", 2, photos);
	}

}
