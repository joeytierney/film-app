package com.filmApp.FilmFactory;

public class AustinPowers extends Movie {
	
	@Override
	public Cast getCast() {
		String[] names = {"Mike Myers", "Elizabeth Hurley"};
		String[] charNames = {"Austin Powers / Dr. Evil", "Vanessa Kensington"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Jay Roach", "Mike Myers"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/austinPowers/austinPowers1.jpg", "images/austinPowers/austinPowers2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/austinPowers/austinPowersPoster.jpg", "Austin Powers", "2 May 1997", 2, photos, "1h 35min", "$33,000,000 (estimated)" , "$312,016,858 ", "Dr. Evil uses a device he calls a \"Time Machine\" to travel back to 1969 and remove Austin Powers' mojo. The sexually wounded swinger must travel back in time and, with the help of agent Felicity Shagwell, recover his vitality. Meanwhile, Dr. Evil's personal life runs amok as he discovers love, continues to shun his son and develops a close relationship with himself. Well, actually, a clone 1/8 his size whom he dubs \"Mini-Me\". The always time-baffled Dr. Evil begins his plan to put a gigantic cannon on the moon, thus turning it into a device called either \"The Death Star\" or \"Alan Parson's Project,\" depending on which name is available. ");
	}
}
