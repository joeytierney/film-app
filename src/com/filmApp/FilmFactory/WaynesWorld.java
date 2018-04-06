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
		String[] photos = {"images/waynesworld/ww1.jpg", "images/waynesworld/ww2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/waynesworld/wwPoster.jpg", "Wayne's World", "14 February 1992", 2, photos, "1h 34min", "$20,000,000 (estimated)", "$183,100,000", "Wayne is still living at home. He has a world class collection of name tags from jobs he's tried, but he does have his own public access TV show. A local station decides to hire him and his sidekick, Garth, to do their show professionally and Wayne & Garth find that it is no longer the same. Wayne falls for a bass guitarist and uses his and Garth's Video contacts to help her career along, knowing that Ben Oliver, the sleazy advertising guy who is ruining their show will probably take her away from him if they fail.");
	}

}
