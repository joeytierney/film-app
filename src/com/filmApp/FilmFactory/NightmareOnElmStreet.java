package com.filmApp.FilmFactory;

public class NightmareOnElmStreet extends Movie {
	
	@Override
	public Cast getCast() {
		String[] names = {"Ronee Blakley", "Robert Englund"};
		String[] charNames = {"Marge Thompson", "Fred Krueger"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Wes Craven", "Wes Craven"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/nightmare/nightmare1.jpg", "images/nightmare/nightmare2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/nightmare/nightmarePoster.jpg", "A Nightmare On Elm Street", "16 November 1984", 2, photos, "1h 31min", "$1,800,000 (estimated)", "$25,504,513", "On Elm Street, Nancy Thompson and a group of her friends (comprising Tina Gray, Rod Lane and Glen Lantz) are being tormented by a clawed killer in their dreams named Fred Krueger. Nancy must think quickly, as Fred tries to pick them off one by one. When he has you in your sleep, who is there to save you?");
	}

}
