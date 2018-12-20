package bl.mobile.android.feed;

import org.openqa.selenium.WebElement;

import core.automation.MobileDriverElement;

public class FeedElement {
	private MobileDriverElement mobileElement;

	public FeedElement(MobileDriverElement mobileElement) {
		this.mobileElement = mobileElement;
	}

	public WebElement openFeedSongViewElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/album_art_play_button_overlay");
	}

	public WebElement openSongInProgressElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/media_mini_bar_progress_bar");
	}

}
