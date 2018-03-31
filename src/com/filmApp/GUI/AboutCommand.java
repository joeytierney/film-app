/**
 * 
 */
package com.filmApp.GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AboutCommand implements Command {
	
	JFrame myFrame;
	
	public AboutCommand(JFrame frame) {
		myFrame = frame;
	}
	
	public void Execute() {
		JOptionPane.showMessageDialog(myFrame, "Created by Eoghan de Bhal and Joseph Tierney");
	}

}
