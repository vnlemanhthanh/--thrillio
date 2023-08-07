package edu.fx.thrillio;

import edu.fx.thrillio.constants.KidFriendlyStatus;
import edu.fx.thrillio.constants.UserType;
import edu.fx.thrillio.controllers.BookmarkController;
import edu.fx.thrillio.entities.Bookmark;
import edu.fx.thrillio.entities.User;

public class View {
    public static void browse(User user, Bookmark[][] bookmarks) {
	System.out.println("\n" + user.getEmail() + " is browsing items ...");
	int bookmarkCount = 0;

	for (Bookmark[] bookmarkList : bookmarks) {
	    for (Bookmark bookmark : bookmarkList) {
		// bookmarking!!
		if (bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {
		    boolean isBookmarked = getBookmarkDecision(bookmark);
		    if (isBookmarked) {
			bookmarkCount++;
			BookmarkController.getInstance().saveUserBookmark(user,
				bookmark);
			System.out
				.println("New item bookmarked -- " + bookmark);
		    }
		}

		// Mark as kid-friendly
		if (user.getUserType().equals(UserType.EDITER)
			|| user.getUserType().equals(UserType.CHIEF_EDITOR)) { // usertype
		    if (bookmark.getKidFriendlyStatus()
			    .equals(KidFriendlyStatus.UNKNOWN)) { // mark
			if (bookmark.isKidFriendlyEligible()) { // isKidFriendlyEligible
			    String kidFriendlyStatus = getKidFriendlyStatusDecision(
				    bookmark);
			    if (!kidFriendlyStatus
				    .equals(KidFriendlyStatus.UNKNOWN)) {
				bookmark.setKidFriendlyStatus(
					kidFriendlyStatus);
				System.out.println("Kid-friendly status: "
					+ kidFriendlyStatus + ", " + bookmark);
			    }
			}
		    }
		}

	    }
	}

    }

    private static boolean getBookmarkDecision(Bookmark bookmark) {
	return Math.random() < 0.5 ? true : false;
    }

    private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
	double randomVal = Math.random();
	return randomVal < 0.5 ? KidFriendlyStatus.UNKNOWN
		: (randomVal >= 0.5 && randomVal < 0.75)
			? KidFriendlyStatus.APPROVED
			: KidFriendlyStatus.REJECTED;

    }

//    public static void bookmark(User user, Bookmark[][] bookmarks) {
//
//	System.out.println("\n" + user.getEmail() + " is bookmarking");
//	for (int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
//	    int typeOffset = (int) (Math.random()
//		    * DataStore.BOOKMARK_TYPES_COUNT);
//	    int bookmarkOffset = (int) (Math.random()
//		    * DataStore.BOOKMARK_COUNT_PER_TYPE);
//
//	    Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
//
//	    BookmarkController.getInstance().saveUserBookmark(user, bookmark);
//
//	    System.out.println(bookmark);
//	}
//    }

}
