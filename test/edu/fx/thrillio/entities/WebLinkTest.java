package edu.fx.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.fx.thrillio.managers.BookmarkManager;

public class WebLinkTest {

    @Test
    public void testIsKidFriendlyEligible() {
	// Test 1: porn in url -- false
	WebLink weblink = BookmarkManager.getInstance().createWebLink(2000,
		"Taming Tiger Part 2",
		"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
		"http://www.javaworld.com");
	boolean isKidFriendlyEligible = weblink.isKidFriendlyEligible();
	assertFalse(
		"for porn in url -- isKidFriendlyEligible() must return false",
		isKidFriendlyEligible);
	
	// Test 2: porn in title -- false
	weblink = BookmarkManager.getInstance().createWebLink(2000,
		"Taming porn Part 2",
		"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
		"http://www.javaworld.com");
	isKidFriendlyEligible = weblink.isKidFriendlyEligible();
	assertFalse(
		"for porn in title -- isKidFriendlyEligible() must return false",
		isKidFriendlyEligible);
	
	// Test 3: adult in host -- false
	weblink = BookmarkManager.getInstance().createWebLink(2000,
		"Taming tiger Part 2",
		"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
		"http://www.javadult.com");
	isKidFriendlyEligible = weblink.isKidFriendlyEligible();
	assertFalse(
		"for adult in host -- isKidFriendlyEligible() must return false",
		isKidFriendlyEligible);
	
	// Test 4: adult in url, but not in host part -- true
	weblink = BookmarkManager.getInstance().createWebLink(2000,
		"Taming adult Part 2",
		"http://www.javaworld.com/article/2072759/core-adult/taming-tiger--part-2.html",
		"http://www.javacore.com");
	isKidFriendlyEligible = weblink.isKidFriendlyEligible();
	assertTrue(
		"for adult in url only -- isKidFriendlyEligible() must return true",
		isKidFriendlyEligible);
	
	// Test 5: adult in title only --true
	weblink = BookmarkManager.getInstance().createWebLink(2000,
		"Taming adult Part 2",
		"http://www.javaworld.com/article/2072759/core-core/taming-tiger--part-2.html",
		"http://www.javacore.com");
	isKidFriendlyEligible = weblink.isKidFriendlyEligible();
	assertTrue(
		"for adult in title only -- isKidFriendlyEligible() must return true",
		isKidFriendlyEligible);
    }

}
