package com.filmApp.FilmFactory;

public class WaynesWorld extends Movie {

	@Override
	public Cast getCast() {
		String[] names = {"Mike Myers", "Dana Carvey"};
		String[] charNames = {"Wayne Campbell", "Garth Algar"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Penelope Spheeris", "Mike Myers"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("Wayne's World", "14 February 1992", 2, photos);
	}

}
