package core.automation;

import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class SeleniumMobileDriver {
	private String urlHost;
	private String osType;
	private Map<String, String> map;

	public SeleniumMobileDriver(String urlHost, String osType, Map<String, String> map) {
		this.urlHost = urlHost;
		this.osType = osType;
		this.map = map;
	}

	public AppiumDriver<MobileElement> getMobileDriver() {
		AppiumDriver<MobileElement> mobileDriver = null;
		DesiredCapabilities cap = new DesiredCapabilities();
		for (Map.Entry<String, String> entry : this.map.entrySet()) {
			cap.setCapability(entry.getKey(), entry.getValue());
		}
		try {
			switch (osType) {
			case "android":
				cap.setCapability("platformName", "Android");
				return mobileDriver = new AndroidDriver<MobileElement>(new URL(this.urlHost), cap);
			case "ios":
				cap.setCapability("platformName", "ios");
				return mobileDriver = new IOSDriver<MobileElement>(new URL(this.urlHost), cap);
			default:
				throw new InvalidParameterException(
						"please enter a valid OS type, which should be either 'android' or 'ios'");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mobileDriver;
	}

}
