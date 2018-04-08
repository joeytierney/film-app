package com.filmApp.SingletonPattern;

import javax.swing.JOptionPane;

public class WelcomeMessage {
	
	private static WelcomeMessage msg = new WelcomeMessage();
	
	private WelcomeMessage(){
		// This remains private so that this class cannot be
		// instantiated
	}
	
	public static WelcomeMessage getMessage() {
		return msg;
	}
	
	public void showMessage() {
		JOptionPane.showMessageDialog(null, "Welcome to the greatest film application ever made!");
	}

}
