/**
 *  Concrete command
 */
package com.filmApp.CommandPattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.filmApp.GUI.FilmAppGUI;

public class AboutCommand implements Command {
	
	FilmAppGUI myFrame;
	
	public AboutCommand(FilmAppGUI filmAppGUI) {
		myFrame = filmAppGUI;
	}
	
	public void Execute() {
		JOptionPane.showMessageDialog(null, "Created by Eoghan de Bhal and Joseph Tierney");
	}

}
