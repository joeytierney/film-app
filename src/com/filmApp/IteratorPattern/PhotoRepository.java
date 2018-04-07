package com.filmApp.IteratorPattern;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PhotoRepository implements Container {

	private static ImageIcon image1 = new ImageIcon("/images/simpsons/simpsons1.jpg");
	private static ImageIcon image2 = new ImageIcon("/images/simpsons/simpsons2.jpg");
	private static ImageIcon image3 = new ImageIcon("/images/teamAmerica/ta1.jpg");
	private static ImageIcon image4 = new ImageIcon("/images/teamAmerica/ta2.jpg");
	private static ImageIcon image5 = new ImageIcon("/images/waynesworld/ww1.jpg");
	private static ImageIcon image6 = new ImageIcon("/images/waynesworld/ww2.jpg");
	private static ImageIcon image7 = new ImageIcon("/images/austinPowers/austinPowers1.jpg");
	private static ImageIcon image8 = new ImageIcon("/images/austinPowers/austinPowers2.jpg");
	
	private static ImageIcon image9 = new ImageIcon("/images/fightClub/fightclub1.jpg");
	private static ImageIcon image10 = new ImageIcon("/images/fightClub/fightclub2.jpg");
	private static ImageIcon image11 = new ImageIcon("/images/inception/inception1.jpg");
	private static ImageIcon image12 = new ImageIcon("/images/inception/inception2.jpg");
	private static ImageIcon image13 = new ImageIcon("/images/inception/inception3.jpg");
	private static ImageIcon image14 = new ImageIcon("/images/lotr/lotr1.jpg");
	private static ImageIcon image15 = new ImageIcon("/images/lotr/lotr2.jpg");
	private static ImageIcon image16 = new ImageIcon("/images/lotr/lotr3.jpg");
	private static ImageIcon image17 = new ImageIcon("/images/darkKnight/dk1.jpg");
	private static ImageIcon image18 = new ImageIcon("/images/darkKnight/dk2.jpg");
	
	private static ImageIcon image19 = new ImageIcon("/images/omen/omen1.jpg");
	private static ImageIcon image20 = new ImageIcon("/images/omen/omen2.jpg");
	private static ImageIcon image21 = new ImageIcon("/images/texas/texas1.jpg");
	private static ImageIcon image22 = new ImageIcon("/images/texas/texas2.jpg");
	private static ImageIcon image23 = new ImageIcon("/images/nightmare/nightmare1.jpg");
	private static ImageIcon image24 = new ImageIcon("/images/nightmare/nightmare2.jpg");
	private static ImageIcon image25 = new ImageIcon("/images/halloween/halloween1.jpg");
	private static ImageIcon image26 = new ImageIcon("/images/halloween/halloween2.jpg");
	
	ArrayList<ImageIcon> list = new ArrayList<ImageIcon>();
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new PhotoIterator();
	}
	
	public PhotoRepository(){
		list.add(image1);
		list.add(image2);
		list.add(image3);
		list.add(image4);
		list.add(image5);
		list.add(image6);
		list.add(image7);
		list.add(image8);
		list.add(image9);
		list.add(image10);
		list.add(image11);
		list.add(image12);
		list.add(image13);
		list.add(image14);
		list.add(image15);
		list.add(image16);
		list.add(image17);
		list.add(image18);
		list.add(image19);
		list.add(image20);
		list.add(image21);
		list.add(image22);
		list.add(image23);
		list.add(image24);
		list.add(image25);
		list.add(image26);
	}
	
	private class PhotoIterator implements Iterator {

		private int index;
		
		@Override
		public boolean hasNext() {
			//if(index < list.length){
			return true;
			//}	
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return list;
			}
			else{
				return null;
			}
		}

		@Override
		public Object prev() {
			return null;
		}
		
	}
	
}