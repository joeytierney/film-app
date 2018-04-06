package com.filmApp.FilmFactory;

public class Omen extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Gregory Peck", "Harvey Stephens"};
		String[] charNames = {"Robert Thorn", "Damien"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Richard Donner", " David Seltzer "};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/omen/omen1.jpg", "images/omen/omen2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/omen/omenPoster.jpg", "The Omen", "25 June 1976", 2, photos, "1h 51min", "$2,800,000 (estimated)", "$60,922,980, 31 December 1976", "Robert and Katherine Thorn seem to have it all. They are happily married and he is the US Ambassador to Great Britain, but they want nothing more than to have children. When Katharine has a stillborn child, Robert is approached by a priest at the hospital who suggests that they take a healthy newborn whose mother has just died in childbirth. Without telling his wife he agrees. After relocating to London, strange events - and the ominous warnings of a priest - lead him to believe that the child he took from that Italian hospital is evil incarnate.");
	}

}
