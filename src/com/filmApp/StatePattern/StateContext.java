package com.filmApp.StatePattern;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

public class StateContext {
	
	private PictureControllerState aState;
	
	public StateContext(){
		aState = new PictureAvailable();
	}
	
	public void setState(PictureControllerState pState){
		aState = pState;
	}
	
	public String getStateAsText() {
		String IStateText = "";
		if(aState instanceof PictureAvailable){
			IStateText = "PictureAvailable";
		}
		
		return (IStateText);
	}
	
	public void pictureAvail(){
		aState.pictureAvail((Context) this);
	}

}
