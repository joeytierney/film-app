package com.filmApp.CompositePattern;

import java.util.Enumeration;

import javafx.scene.Node;

public interface filmInter {
	
	// leaf interface
	public String getName();
	
	
	// Node interface
	public Enumeration<?> elements();
	public Node getChild(String nodeName);
	public void add(Object obj);
	public void remove(Object obj);
	

}
