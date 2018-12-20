package bl.mobile.android.songbook;

import org.openqa.selenium.WebElement;

import core.automation.MobileDriverElement;

public class SongBookElement {
	private MobileDriverElement mobileElement;

	public SongBookElement(MobileDriverElement mobileElement) {
		this.mobileElement = mobileElement;
	}

	public WebElement searchButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/action_search");
	}

	public WebElement searchTextFieldElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/search_edit_text");
	}

}
