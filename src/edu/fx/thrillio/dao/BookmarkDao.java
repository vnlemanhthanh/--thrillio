package edu.fx.thrillio.dao;

import edu.fx.thrillio.DataStore;
import edu.fx.thrillio.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks() {
	return DataStore.getBookmarks();
    }
}
