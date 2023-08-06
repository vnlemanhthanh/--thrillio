package edu.fx.thrillio.managers;

import edu.fx.thrillio.entities.Book;
import edu.fx.thrillio.entities.Movie;
import edu.fx.thrillio.entities.Weblink;

public class BookmarkManager {
    static private BookmarkManager instance = new BookmarkManager();
    private double amazoneRating;

    private BookmarkManager() {
    }

    static public BookmarkManager getInstance() {
	return instance;
    }

    public Weblink createWebLink(long id, String title, String url,
	    String host) {
	Weblink weblink = new Weblink();
	weblink.setId(id);
	weblink.setTitle(title);
	weblink.setUrl(url);
	weblink.setHost(host);

	return weblink;
    }

    public Book createBook(long id, String title, int publicationYear,
	    String publisher, String[] authors, String genre) {
	Book book = new Book();
	book.setId(id);
	book.setTitle(title);
	book.setPublicationYear(publicationYear);
	book.setPublisher(publisher);
	book.setAuthors(authors);
	book.setGenre(genre);
	book.setAmazoneRating(amazoneRating);

	return book;
    }

    public Movie createMovie(long id, String title, String profileUrl,
	    int releaseYear, String[] cast, String[] drectors, String genre,
	    double imdbRating) {
	Movie movie = new Movie();
	movie.setId(id);
	movie.setTitle(title);
	movie.setProfileUrl(profileUrl);
	movie.setReleaseYear(releaseYear);
	movie.setCast(cast);
	movie.setDirectors(drectors);
	movie.setGenre(genre);
	movie.setImdbRating(imdbRating);

	return movie;
    }

}