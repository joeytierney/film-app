package com.filmApp.FilmFactory;

public class TeamAmerica extends Movie{

	@Override
	public Cast getCast() {
		String[] names = {"Trey Parker", "Matt Stone"};
		String[] charNames = {"Gary Johnston", "Chris"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Trey Parker", "Matt Stone"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers1.jpg", "images/austinPowers2.jpg"};
		return new FilmDetails("Team America:World Police", "15 October 2004", 2, photos);
	}

}
