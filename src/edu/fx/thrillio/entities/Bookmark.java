package edu.fx.thrillio.entities;

import edu.fx.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
	private long id;
	private String title;
	private String profileUrl;
	private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
	private User kidFriendMarkedBy;
	private User sharedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getKidFriendlyStatus() {
	    return kidFriendlyStatus;
	}

	public void setKidFriendlyStatus(String kidFriendlyStatus) {
	    this.kidFriendlyStatus = kidFriendlyStatus;
	}

	public User getKidFriendMarkedBy() {
	    return kidFriendMarkedBy;
	}

	public void setKidFriendMarkedBy(User kidFriendMarkedBy) {
	    this.kidFriendMarkedBy = kidFriendMarkedBy;
	}

	public User getSharedBy() {
	    return sharedBy;
	}

	public void setSharedBy(User sharedBy) {
	    this.sharedBy = sharedBy;
	}

	/**
	 * 
	 * @return isKidFriendlyEligible
	 */
	public abstract boolean isKidFriendlyEligible();

}
