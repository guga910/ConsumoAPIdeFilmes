package com.example.desafioAlura.DaysOfCode.Entity;

import java.util.Objects;

public class Filme {

//	https://codebeautify.org/json-to-java-converter
	
	private String id;// 3
	 private String rank;// 7
	 private String title;// 11
	 private String fullTitle;// 15
	 private String year;// 19
	 private String image;// 23
	 private String crew;// 27
	 private String imDbRating;// 31
	 private String imDbRatingCount; //35
	 
	 public Filme() {}
	 
	public Filme(String id, String rank, String title, String fullTitle, String year, String image, String crew,
			String imDbRating, String imDbRatingCount) {
		super();
		this.id = id;
		this.rank = rank;
		this.title = title;
		this.fullTitle = fullTitle;
		this.year = year;
		this.image = image;
		this.crew = crew;
		this.imDbRating = imDbRating;
		this.imDbRatingCount = imDbRatingCount;
	}
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullTitle() {
		return fullTitle;
	}

	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getImDbRating() {
		return imDbRating;
	}

	public void setImDbRating(String imDbRating) {
		this.imDbRating = imDbRating;
	}

	public String getImDbRatingCount() {
		return imDbRatingCount;
	}

	public void setImDbRatingCount(String imDbRatingCount) {
		this.imDbRatingCount = imDbRatingCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(crew, fullTitle, id, imDbRating, imDbRatingCount, image, rank, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return Objects.equals(crew, other.crew) && Objects.equals(fullTitle, other.fullTitle)
				&& Objects.equals(id, other.id) && Objects.equals(imDbRating, other.imDbRating)
				&& Objects.equals(imDbRatingCount, other.imDbRatingCount) && Objects.equals(image, other.image)
				&& Objects.equals(rank, other.rank) && Objects.equals(title, other.title)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", rank=" + rank + ", title=" + title + ", fullTitle=" + fullTitle + ", year=" + year
				+ ", image=" + image + ", crew=" + crew + ", imDbRating=" + imDbRating + ", imDbRatingCount="
				+ imDbRatingCount + "]";
	}
	 
	 
	
}
