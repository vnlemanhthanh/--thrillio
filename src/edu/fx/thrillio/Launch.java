package edu.fx.thrillio;

import edu.fx.thrillio.entities.Bookmark;
import edu.fx.thrillio.entities.User;
import edu.fx.thrillio.managers.BookmarkManager;
import edu.fx.thrillio.managers.UserManager;

public class Launch {
    private static User[] users;
    private static Bookmark[][] bookmarks;

    private static void loadData() {
	System.out.println("\n1. Loading data ...");
	DataStore.loadData();

	users = UserManager.getInstance().getUsers();
	bookmarks = BookmarkManager.getInstance().getBookmarks();

	System.out.println("Printing data ...");
	printUserData();
	printBookmarkData();
    }

    private static void printUserData() {
	for (User user : users) {
	    System.out.println(user);
	}

    }

    private static void printBookmarkData() {
	for (Bookmark[] bookmarkList : bookmarks) {
	    for (Bookmark bookmark : bookmarkList) {
		System.out.println(bookmark);
	    }
	}

    }

    private static void startBookmarking() {
	System.out.println("\n2. Bookmarking ...");
	for (User user : users) {
	    View.bookmark(user, bookmarks);
	}
	
    }

    // Client Test
    public static void main(String[] args) {
	loadData();
	startBookmarking();
	
    }
}
