package com.filmApp.FilmFactory;

public class LordOfTheRings extends Movie {

	@Override
	public Cast getCast() {
		String[] names = {"Orlando Bloom", "Sean Bean"};
		String[] charNames = {"Legolas", "Boromir"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"Peter Jackson", "J.R.R. Tolkien"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/lotr/lotr1.jpg", "images/lotr/lotr2.jpg", "images/lotr/lotr3.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/lotr/lotrPoster.jpg", "The Lord of the Rings", "19 December 2001", 3, photos, "2h 58min", "$93,000,000 (estimated)", "$871,530,324, 25 November 2011", "An ancient Ring thought lost for centuries has been found, and through a strange twist in fate has been given to a small Hobbit named Frodo. When Gandalf discovers the Ring is in fact the One Ring of the Dark Lord Sauron, Frodo must make an epic quest to the Cracks of Doom in order to destroy it! However he does not go alone. He is joined by Gandalf, Legolas the elf, Gimli the Dwarf, Aragorn, Boromir and his three Hobbit friends Merry, Pippin and Samwise. Through mountains, snow, darkness, forests, rivers and plains, facing evil and danger at every corner the Fellowship of the Ring must go. Their quest to destroy the One Ring is the only hope for the end of the Dark Lords reign!");
	}
}
