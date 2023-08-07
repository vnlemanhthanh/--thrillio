package edu.fx.thrillio.entities;

import java.util.Arrays;

import edu.fx.thrillio.constants.BookGenre;

public class Book extends Bookmark {
	private int publicationYear;
	private String publisher;
	private String[] authors;
	private String genre;
	private double amazoneRating;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazoneRating() {
		return amazoneRating;
	}

	public void setAmazoneRating(double amazoneRating) {
		this.amazoneRating = amazoneRating;
	}

	@Override
	public String toString() {
	    return "Book [publicationYear=" + publicationYear + ", publisher="
		    + publisher + ", authors=" + Arrays.toString(authors)
		    + ", genre=" + genre + ", amazoneRating=" + amazoneRating
		    + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
	    if (genre.contains(BookGenre.PHILOSOPHY) || genre.contains(BookGenre.SELF_HELP)) {
		return false;
	    }
	    return true;
	}

}