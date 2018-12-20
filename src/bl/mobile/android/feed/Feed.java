package bl.mobile.android.feed;

import bl.mobile.android.Base;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Feed extends Base{
	private FeedElement element;
	private LogResults log;

	public Feed(AppiumDriver<MobileElement> driver, LogResults log) {
		super(driver);
		this.log = log;
		this.element = new FeedElement(mobileElement);
	}
	
	public void clickCallSongFromTheFeed() {
		this.log.startStep("click on the first song in the feed to start listening it");
		this.element.openFeedSongViewElement().click();
		log.endStep();
	}

}
