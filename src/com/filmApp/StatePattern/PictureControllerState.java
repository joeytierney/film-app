package com.filmApp.StatePattern;

import javax.swing.ImageIcon;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

public interface PictureControllerState {
	
	public void pictureAvail (Context stateContext);
	public void noPicture (Context context);
	
	public ImageIcon getImage (Context context);

}
