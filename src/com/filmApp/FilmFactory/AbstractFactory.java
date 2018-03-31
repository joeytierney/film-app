package com.filmApp.FilmFactory;

public abstract class AbstractFactory {
	abstract Cast getCast(String castType, String name, String character);
	abstract Crew getCrew(String crewType, String name);
	abstract Film getFilm(String filmGenre, String title, String releaseDate);
}
