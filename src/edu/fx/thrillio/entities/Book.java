package edu.fx.thrillio.entities;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import edu.fx.thrillio.constants.BookGenre;
import edu.fx.thrillio.partner.Shareable;

public class Book extends Bookmark implements Shareable {
    private int publicationYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRating;

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

    public double getAmazonRating() {
	return amazonRating;
    }

    public void setAmazonRating(double amazoneRating) {
	this.amazonRating = amazoneRating;
    }

    @Override
    public String toString() {
	return "Book [publicationYear=" + publicationYear + ", publisher="
		+ publisher + ", authors=" + Arrays.toString(authors)
		+ ", genre=" + genre + ", amazoneRating=" + amazonRating + "]";
    }

    @Override
    public boolean isKidFriendlyEligible() {
	if (genre.contains(BookGenre.PHILOSOPHY)
		|| genre.contains(BookGenre.SELF_HELP)) {
	    return false;
	}
	return true;
    }

    @Override
    public String getItemData() {
	StringBuilder builder = new StringBuilder();
	builder.append("<item>");
	builder.append("<type>Book</type>");
	builder.append("<title>").append(getTitle()).append("</title>");
	builder.append("<authors>").append(StringUtils.join(authors, ","))
		.append("</authors>");
	builder.append("<publisher>").append(publisher).append("</publisher>");
	builder.append("<publicationYear>").append(publicationYear)
		.append("</publicationYear>");
	builder.append("<genre>").append(genre).append("</genre>");
	builder.append("<amazoneRating>").append(amazonRating)
		.append("</amazoneRating>");
	builder.append("<title>").append(getTitle()).append("</title>");
	builder.append("</item>");

	return builder.toString();
    }

}