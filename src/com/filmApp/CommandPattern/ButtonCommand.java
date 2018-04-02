package com.filmApp.CommandPattern;

import javax.swing.JButton;

public class ButtonCommand extends JButton implements CommandHolder{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Command buttonCommand;
	public ButtonCommand(String name){
		super(name);
	}
	
	public void setCommand(Command comd) {
		buttonCommand = comd;
	}
	
	public Command getCommand() {
		return buttonCommand;
	}
	
}
