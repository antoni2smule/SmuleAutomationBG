package bl.mobile.android.songinprogress;

import org.openqa.selenium.WebElement;

import core.automation.MobileDriverElement;

public class SongInProgressElement {
	private MobileDriverElement mobileElement;

	public SongInProgressElement(MobileDriverElement mobileELement) {
		this.mobileElement = mobileELement;
	}

	public WebElement clickOpenSongInProgressElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/media_mini_bar_progress_bar");
	}

	public WebElement clickCollapseSongInProgressElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/left_button");
	}

	public WebElement clickPauseSongInProgressFromMinibarElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/album_art_play_pause_button");
	}

	public WebElement clickLoveSongInProgress() {
		return mobileElement.getElementById("com.smule.singandroid:id/love_icon");
	}

}
