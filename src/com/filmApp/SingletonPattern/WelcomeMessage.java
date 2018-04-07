package com.filmApp.SingletonPattern;

import javax.swing.JOptionPane;

public class WelcomeMessage {
	
	private static WelcomeMessage msg = new WelcomeMessage();
	
	public static WelcomeMessage getMessage() {
		return msg;
	}
	
	public void showMessage() {
		JOptionPane.showMessageDialog(null, "Welcome to the greatest film application ever made!");
	}

}
