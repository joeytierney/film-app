package com.filmApp.StatePattern;

import javax.swing.ImageIcon;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

public class PictureAvailable implements PictureControllerState {

	private static final String sImageFile = "/darkKingt/dk2.jpg";
	
	@Override
	public void pictureAvail(Context context) {
		// TODO Auto-generated method stub
		//context.setState (new getPicture());
		
	}

	@Override
	public void noPicture(Context context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ImageIcon getImage(Context context) {
		// TODO Auto-generated method stub
		return (new ImageIcon (PictureAvailable.class.getResource("images/" + sImageFile)));
	}

}
