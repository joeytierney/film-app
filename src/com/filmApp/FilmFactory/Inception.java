package com.filmApp.FilmFactory;

public class Inception extends Movie{

	@Override
	public Cast getCast() {
		String[] names = {"Leonardo DiCaprio", "Ellen Page"};
		String[] charNames = {"Cobb", "Ariadne"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Christopher Nolan", "Christopher Nolan"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/inception/inception1.jpg", "images/inception/inception2.jpg", "images/inception/inception3.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/inception/inceptionPoster.jpg", "Inception", "1 July 2010", 3, photos, "2h 28min", "$160,000,000 (estimated)", "$825,532,764, 6 January 2011", "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible - inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming.");
	}

}
