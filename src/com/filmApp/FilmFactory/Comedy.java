package com.filmApp.FilmFactory;

public class Comedy implements Film{
	
	private String title;
	private String releaseDate;
	
	public Comedy(String title, String releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

}
