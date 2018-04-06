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
		String[] photos = {"images/teamAmerica/ta1.jpg", "images/teamAmerica/ta2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/teamAmerica/taPoster.jpg", "Team America:World Police", "15 October 2004", 2, photos, "1h 38min", "$30,000,000 (estimated)", "$17,447,224, 31 December 2004", "The North American counter-terrorism force Team America attacks a group of terrorists in Paris. Later, the leader of the organization, Spottswoode, invites the famous Broadway actor Gary Johnston to join his world police and work undercover in Cairo, infiltrating a terrorist organization in the hope they will disclose their plan of destroying the world. Team America destroy the cell of terrorists, but then the Panama Canal is attacked by the criminals as a payback. Gary feels responsible for the death of many innocents and leaves the counter-terrorism organization. When the leader of North Korea, Kim Jong Il, joins a group of pacifist actors and actresses with the intention of using weapons of massive destruction, Team America tries to avoid the destruction of the world. ");
	}

}
