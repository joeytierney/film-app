package com.filmApp.FilmFactory;

public class MovieTester {
	
	public static void main(String[] args) {
		MovieStore comedyStore = new ComedyMovieStore();
		
		Movie movie = comedyStore.orderMovie("austin powers");
		System.out.println("Movie is: " + movie.getFilmDetails().getTitle());
	}

}
