package bl.mobile.android.bottombarmenu;

import bl.mobile.android.Base;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BottomBarMenu extends Base{
	
	private BottomBarMenuElement element;
	private LogResults log;

	public BottomBarMenu(AppiumDriver<MobileElement> driver, LogResults log) {
		super(driver);
		this.log = log;
		this.element = new BottomBarMenuElement(mobileElement);
	}
	
	public void clickFeedButton() {
		log.startStep("click the 'Feed' button on the bottom navigation bar");
		this.element.feedButtonElement().click();
		log.endStep();
	}
	
	public void clickExploreButton() {
		log.startStep("click the 'Explore' button on the bottom navigation bar");
		this.element.exploreButtonElement().click();
		log.endStep();
	}
	
	public void clickSongbookButton() {
		log.startStep("click the 'Song book' button on the bottom navigation bar");
		this.element.songbookButtonElement().click();
		log.endStep();
	}
	
	public void clickNotificationsButton() {
		log.startStep("click the 'Notifications' button on the bottom navigation bar");
		this.element.notificationsButtonElement().click();
		log.endStep();
	}
	
	public void clickProfileButton() {
		log.startStep("click the 'Profile' button on the bottom navigation bar");
		this.element.profileButtonElement().click();
		log.endStep();
	}

}
