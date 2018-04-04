package com.filmApp.FilmFactory;

public class Cast {
	
	private int numCast;
	private String[] names;
	private String[] characterNames;
	
	public Cast(int numCastIn, String[] namesIn, String[] characterNamesIn) {
		this.numCast = numCastIn;
		this.names = namesIn;
		this.characterNames = characterNamesIn;
	}

	/**
	 * @return the numCast
	 */
	public int getNumCast() {
		return numCast;
	}

	/**
	 * @param numCast the numCast to set
	 */
	public void setNumCast(int numCast) {
		this.numCast = numCast;
	}

	/**
	 * @return the names
	 */
	public String getName(int nameNum) {
		return names[nameNum];
	}

	/**
	 * @param names the names to set
	 */
	public void setName(int nameNum,String nameIn) {
		this.names[nameNum] = nameIn;
	}

	/**
	 * @return the characterNames
	 */
	public String getCharacterName(int nameNum) {
		return characterNames[nameNum];
	}

	/**
	 * @param characterNames the characterNames to set
	 */
	public void setCharacterNames(int nameNum, String characterName) {
		this.characterNames[nameNum] = characterName;
	}
	
	public String getAllCastMembers() {
		String total = "";
		
		for(int i = 0; i < this.getNumCast(); i++) {
			total += this.getName(i) + " : " + this.getCharacterName(i) + "\n";
		}
		
		return total;
	}

}
