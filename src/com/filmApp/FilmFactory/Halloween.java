package com.filmApp.FilmFactory;

public class Halloween extends Movie {
	
	@Override
	public Cast getCast() {
		String[] names = {"Jamie Lee Curtis", "Donald Pleasence"};
		String[] charNames = {"Laurie", "Loomis"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"John Carpenter", "John Carpenter"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		return new FilmDetails("Halloween", "27 October 1978");
	}

}
