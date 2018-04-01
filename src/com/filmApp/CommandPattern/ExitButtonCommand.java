package com.filmApp.CommandPattern;

public class ExitButtonCommand implements Command {
	
	public void Execute() {
		System.exit(0);
	}
}