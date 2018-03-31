/**
 * 
 */
package com.filmApp.GUI;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class MenuCommand extends JMenuItem implements CommandHolder {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Command menuCommand;
	protected JFrame myFrame;
	
	public MenuCommand(String name, JFrame frame) {
		
		super(name);
		myFrame = frame;
	}
	
	public void setCommand(Command comd) {
		menuCommand = comd;
	}
	
	public Command getCommand() {
		return menuCommand;
	}

}
