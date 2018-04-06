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
		String[] photos = {"images/halloween/halloween1.jpg", "images/halloween/halloween2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/halloween/halloweenPoster.jpg", "Halloween", "27 October 1978", 2, photos, "1h 31min", "$300,000 (estimated)", "$70,000,000", "The year is 1963, the night: Halloween. Police are called to 43 Lampkin Ln. only to discover that 15 year old Judith Myers has been stabbed to death, by her 6 year-old brother, Michael. After being institutionalized for 15 years, Myers breaks out on the night before Halloween. No one knows, nor wants to find out, what will happen on October 31st 1978 besides Myers' psychiatrist, Dr. Loomis. He knows Michael is coming back to Haddonfield, but by the time the town realizes it, it'll be too late for many people.");
	}

}
