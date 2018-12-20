package core.automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SeleniumDriver {

	private Properties config;
	private String urlHost;
	private String configLocation;

	public SeleniumMobileDriver mobileDriver;
	public SeleniumWebDriver webDriver;

	public SeleniumDriver(String appConfig) {
		config = new Properties();
		try {
			this.configLocation = appConfig;
			config.load(new FileInputStream(configLocation));
			urlHost = config.getProperty("urlHost");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public AppiumDriver<MobileElement> getMobileDriver(Map<String, String> map) {
		try {
			String osType = this.config.getProperty("osType");
			this.mobileDriver = new SeleniumMobileDriver(this.urlHost, osType, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.mobileDriver.getMobileDriver();
	}

	public RemoteWebDriver getWebDriver() {
		try {
			String browserType = config.getProperty("browserType");
			this.webDriver = new SeleniumWebDriver(this.urlHost, browserType);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.webDriver.getWebDriver();

	}

}