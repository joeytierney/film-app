package com.filmApp.CompositePattern;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public abstract class AbstractFilm {
	
	protected String filmName;
	protected Film<?> parent = null;
	protected boolean leaf = true;
	
	public abstract String getName();
	public abstract boolean add(Film<?> f) throws NoSuchElementException;
	public abstract void remove(Film<?> f) throws NoSuchElementException;
	public abstract Enumeration<?> subFilms();
	public abstract Film<?> getChild(String s);
	
	public boolean isLeaf() {
		return leaf;
	}

}
