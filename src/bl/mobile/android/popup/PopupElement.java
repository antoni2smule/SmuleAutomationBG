package bl.mobile.android.popup;

import org.openqa.selenium.WebElement;

import core.automation.MobileDriverElement;

public class PopupElement {
	private MobileDriverElement mobileElement;
	
	public PopupElement(MobileDriverElement mobileElement) {
		this.mobileElement = mobileElement;
	}
	
	public WebElement confirmYesButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/yesButton");
	}
	
	public WebElement confirmAllowButtonElement() {
		return mobileElement.getElementById("com.android.packageinstaller:id/permission_allow_button");
	}

	public WebElement isthisYouNoButtonElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/nope_button");
	}
	
	public WebElement coachmarkTooltipElement() {
		return mobileElement.getElementById("com.smule.singandroid:id/coachmark_tooltip");
	}
}
