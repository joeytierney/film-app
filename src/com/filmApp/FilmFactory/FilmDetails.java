package com.filmApp.FilmFactory;

public class FilmDetails {
	
	private String poster;
	private String title;
	private String releaseDate;
	private String[] photos;
	private String runtime;
	private String budget;
	private String boxOffice;
	private String synopsis;
	
	private int numPhotos;
	
	/**
	 * 
	 * @param poster
	 * @param titleIn
	 * @param releaseDateIn
	 * @param numPhotos
	 * @param photos
	 * @param runtime
	 * @param budget
	 * @param boxOffice
	 * @param synopsis
	 */
	public FilmDetails(String poster, String titleIn, String releaseDateIn, int numPhotos, String[] photos, String runtime, String budget, String boxOffice, String synopsis) {
		this.poster = poster;
		this.title = titleIn;
		this.releaseDate = releaseDateIn;
		this.numPhotos = numPhotos;
		this.photos = photos;
		this.runtime = runtime;
		this.budget = budget;
		this.boxOffice = boxOffice;
		this.synopsis = synopsis;
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

	/**
	 * @return the runtime
	 */
	public String getRuntime() {
		return runtime;
	}

	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	/**
	 * @return the budget
	 */
	public String getBudget() {
		return budget;
	}

	/**
	 * @param budget the budget to set
	 */
	public void setBudget(String budget) {
		this.budget = budget;
	}

	/**
	 * @return the boxOffice
	 */
	public String getBoxOffice() {
		return boxOffice;
	}

	/**
	 * @param boxOffice the boxOffice to set
	 */
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	/**
	 * @return the synopsis
	 */
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * @param synopsis the synopsis to set
	 */
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(String[] photos) {
		this.photos = photos;
	}

	/**
	 * @return the poster
	 */
	public String getPoster() {
		return poster;
	}

	/**
	 * @param poster the poster to set
	 */
	public void setPoster(String poster) {
		this.poster = poster;
	}

}
