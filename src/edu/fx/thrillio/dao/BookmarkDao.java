package edu.fx.thrillio.dao;

import edu.fx.thrillio.DataStore;
import edu.fx.thrillio.entities.Bookmark;
import edu.fx.thrillio.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks() {
	return DataStore.getBookmarks();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
	DataStore.add(userBookmark);
	
    }
}
