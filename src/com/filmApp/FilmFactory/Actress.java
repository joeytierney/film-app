package com.filmApp.FilmFactory;

public class Actress implements Cast{
	
	private String name;
	private String characterName;
	
	public Actress(String name, String characterName) {
		this.name = name;
		this.characterName = characterName;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}
	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}
