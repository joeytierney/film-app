package com.filmApp.FilmFactory;

public class Crew {
	
	private int numCrew;
	private String[] names;
	private String[] roles;
	
	public Crew(int numCrewIn, String[] namesIn, String[] rolesIn) {
		this.numCrew = numCrewIn;
		this.names = namesIn;
		this.roles = rolesIn;
	}

	/**
	 * @return the numCrew
	 */
	public int getNumCrew() {
		return numCrew;
	}

	/**
	 * @param numCast the numCast to set
	 */
	public void setNumCast(int numCrew) {
		this.numCrew = numCrew;
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
	public String getRole(int roleNum) {
		return roles[roleNum];
	}

	/**
	 * @param characterNames the characterNames to set
	 */
	public void setRole(int nameNum, String role) {
		this.roles[nameNum] = role;
	}
	
	public String getAllCrewMembers() {
		String total = "";
		
		for(int i = 0; i < this.getNumCrew(); i++) {
			total += this.getName(i) + " : " + this.getRole(i) + "\n";
		}
		
		return total;
	}

}
