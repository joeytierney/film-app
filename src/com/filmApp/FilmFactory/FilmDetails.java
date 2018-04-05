package com.filmApp.FilmFactory;

public class FilmDetails {
	
	private String title;
	private String releaseDate;
	private String[] photos;
	
	private int numPhotos;
	
	public FilmDetails(String titleIn, String releaseDateIn, int numPhotos, String[] photos) {
		this.title = titleIn;
		this.releaseDate = releaseDateIn;
		this.numPhotos = numPhotos;
		this.photos = photos;
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

	/**
	 * @return all photos
	 */
	public String[] getPhotos() {
		return photos;
	}
	
	/**
	 * @return one photo
	 */
	public String getPhoto(int num) {
		return photos[num];
	}

	/**
	 * @param photos the photos to set
	 */
	public void setPhoto(int num, String photo) {
		this.photos[num] = photo;
	}

	/**
	 * @return the numPhotos
	 */
	public int getNumPhotos() {
		return numPhotos;
	}

	/**
	 * @param numPhotos the numPhotos to set
	 */
	public void setNumPhotos(int numPhotos) {
		this.numPhotos = numPhotos;
	}

}
