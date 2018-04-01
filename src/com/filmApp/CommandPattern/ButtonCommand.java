package com.filmApp.CommandPattern;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonCommand extends JButton implements CommandHolder{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Command buttonCommand;
	private JFrame frame;
	
	public ButtonCommand(String name, JFrame myFrame){
		super(name);
		frame = myFrame;
	}
	
	public void setCommand(Command comd) {
		buttonCommand = comd;
	}
	
	public Command getCommand() {
		return buttonCommand;
	}
	
}
