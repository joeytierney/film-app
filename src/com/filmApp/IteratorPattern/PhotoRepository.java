package com.filmApp.IteratorPattern;

public class PhotoRepository implements Container {

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new PhotoIterator();
	}
	
	private class PhotoIterator implements Iterator {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object prev() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}