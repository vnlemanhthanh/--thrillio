package edu.fx.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.fx.thrillio.constants.BookGenre;
import edu.fx.thrillio.managers.BookmarkManager;

public class BookTest {

    @Test
    public void testIsKidFriendlyEligible() {
	Book book = BookmarkManager.getInstance().createBook(4000,
		"Walden", 1854, "Wilder Publications",
		new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY,
		4.3);
	assertFalse("phylosophy not isKidFriendlyEligible ", book.isKidFriendlyEligible());
	
	book = BookmarkManager.getInstance().createBook(4000,
		"Walden", 1854, "Wilder Publications",
		new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP,
		4.3);
	assertFalse("self help not isKidFriendlyEligible ", book.isKidFriendlyEligible());

    }

}
