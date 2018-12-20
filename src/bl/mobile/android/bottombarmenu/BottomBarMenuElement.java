package bl.mobile.android.bottombarmenu;

import org.openqa.selenium.WebElement;
import core.automation.MobileDriverElement;

public class BottomBarMenuElement {
	private MobileDriverElement mobileElement;
	
	public BottomBarMenuElement(MobileDriverElement mobileElement) {
		this.mobileElement = mobileElement;
	}
	
	public WebElement feedButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/bottom_nav_feed");
	}
	
	public WebElement exploreButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/bottom_nav_featured");
	}
	
	public WebElement songbookButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/bottom_nav_sing");
	}
	
	public WebElement notificationsButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/bottom_nav_notifications");
	}
	
	public WebElement profileButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/bottom_nav_profile");
	}
	
	public WebElement newFeedBadgeElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/bottom_nav_feed_badge");
	}
	
	public WebElement newChatBadgeElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/new_chat_badge");
	}
	
	public WebElement newInviteBadgeElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/new_invites_badge");
	}

}
