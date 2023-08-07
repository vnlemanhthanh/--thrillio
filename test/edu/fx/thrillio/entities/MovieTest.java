package edu.fx.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.fx.thrillio.constants.MovieGenre;
import edu.fx.thrillio.managers.BookmarkManager;

public class MovieTest {

    @Test
    public void testIsKidFriendlyEligible() {
	// Test 1: HORROR genre
	Movie movie = BookmarkManager.getInstance().createMovie(3000,
		"Citizen Kane", "", 1941,
		new String[] { "Orson Welles", "Joseph Cotten" },
		new String[] { "Orson Welles" }, MovieGenre.HORROR, 8.5);
	boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
	assertFalse("HORROR genre -- isKidFriendlyEligible() must false ", isKidFriendlyEligible);

	// Test 2: THRILLERS genre
	movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane",
		"", 1941, new String[] { "Orson Welles", "Joseph Cotten" },
		new String[] { "Orson Welles" }, MovieGenre.THRILLERS, 8.5);
	isKidFriendlyEligible = movie.isKidFriendlyEligible();
	assertFalse("THRILLERS genre -- isKidFriendlyEligible() must false ", isKidFriendlyEligible);

    }

}
