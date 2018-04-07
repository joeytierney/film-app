package com.filmApp.IteratorPattern;

public class PhotoRepository implements Container {

	private String photoList[] = {"testing", "testing 2"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new PhotoIterator();
	}
	
	private class PhotoIterator implements Iterator {

		private int photo_position;
		
		@Override
		public boolean hasNext() {
			if(photo_position < photoList.length){
				return true;
			}
			else{
				return false;
			}
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return photoList[photo_position++];
			}
			else{
				return null;
			}
		}

		@Override
		public Object prev() {
			if(this.hasNext()){
				return photoList[photo_position--];
			}
			else{
				return null;
			}
		}
		
	}
	
}