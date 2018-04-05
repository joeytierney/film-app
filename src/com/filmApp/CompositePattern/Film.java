package com.filmApp.CompositePattern;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class Film<E> extends AbstractFilm {
	
	public Film(String initName) {
		filmName = initName;
		leaf = true;
	}// end Film()
	
	public Film(Film<?> initParent, String initName) {
		filmName = initName;
		parent = initParent;
		leaf = true;
	}// end Film()

	@Override
	public String getName() {
		return filmName;
	}

	@Override
	public boolean add(Film<?> f) throws NoSuchElementException {
		throw new NoSuchElementException("No sub-films");
	}// end add()

	@Override
	public void remove(Film<?> f) throws NoSuchElementException {
		throw new NoSuchElementException("No sub-films");
	}

	@Override
	public Enumeration<E> subFilms() {
		Vector<E> v = new Vector<E>();
		return v.elements();
	}// end subFilms()

	@Override
	public Film<?> getChild(String s) {
		throw new NoSuchElementException("No children");
	}// end getChild()
	
	public Film<?> getParent() {
		return parent;
	}

}
