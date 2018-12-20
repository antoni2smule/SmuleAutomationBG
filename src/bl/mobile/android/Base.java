package bl.mobile.android;

import core.automation.MobileDriverElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Base {
	protected MobileDriverElement mobileElement;

	public Base(AppiumDriver<MobileElement> driver) {
		this.mobileElement = new MobileDriverElement(driver);
	}

}
