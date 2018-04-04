package com.filmApp.CompositePattern;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;

public class BaseFilm extends Film<Object> {
	
	Vector<Film<?>> films;
	
	public BaseFilm(String initName) {
		super(initName);
		leaf = false;
		films = new Vector<Film<?>>();
	}
	
	public BaseFilm(Film<?> initParent, String initName) {
		super(initParent, initName);
		films = new Vector<Film<?>>();
		leaf = false;
	}
	
	public boolean add(Film<?> f) throws NoSuchElementException {
		films.addElement(f);
		return true;
	}
	
	public void remove(Film<?> f) throws NoSuchElementException {
		films.removeElement(f);
	}
	
	public Enumeration subFilms() {
		return films.elements();
	}
	
	public Film getChild(String s) throws NoSuchElementException {
		Film newFilm = null;
		
		if(getName().equals(s)) {
			return this;
		} else {
			boolean found = false;
			Enumeration f = subFilms();
			while(f.hasMoreElements() && (!found)) {
				newFilm = (Film)f.nextElement();
				found = newFilm.getName().equals(s);
				if(!found) {
					if(!newFilm.isLeaf()) {
						newFilm = newFilm.getChild(s);
					} else {
						newFilm = null;
					}
					found = (newFilm != null);
				}
			}
			if(found) {
				return newFilm;
			} else {
				return null;
			}
		}
	}// end getChild()

}
