package edu.fx.thrillio.entities;

import edu.fx.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
	private long id;
	private String title;
	private String profileUrl;
	private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;

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

	/**
	 * 
	 * @return isKidFriendlyEligible
	 */
	public abstract boolean isKidFriendlyEligible();
}
