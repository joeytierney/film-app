package com.filmApp.CommandPattern;

public class ExitCommand implements Command {
	
	public void Execute() {
		System.exit(0);
	}

}
