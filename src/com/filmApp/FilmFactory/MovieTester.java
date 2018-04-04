package com.filmApp.FilmFactory;

public class MovieTester {
	
	private static Movie movie1 = null;
	private static Movie movie2 = null;
	
	public static void main(String[] args) {
		movie1 = new TheDarkKnight();
		
		System.out.println("Name: " + movie1.getFilmDetails().getTitle());
		System.out.println("Cast:\n" + movie1.getCast().getAllCastMembers());
		
		movie2 = new Inception();
		
		System.out.println("Name: " + movie2.getFilmDetails().getTitle());
		System.out.println("Cast:\n" + movie2.getCast().getAllCastMembers());
	}

}
