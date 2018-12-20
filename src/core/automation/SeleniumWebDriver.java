package core.automation;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWebDriver {

	private String urlHost;
	private String browserType;

	public SeleniumWebDriver(String urlHost, String browserType) {
		this.urlHost = urlHost;
		this.browserType = browserType;
	}

	public RemoteWebDriver getWebDriver() {
		RemoteWebDriver driver = null;
		try {
			URL _url = new URL(this.urlHost);

			switch (this.browserType) {
			case "fireFox":
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(_url, capability);
				break;
			case "chrome":
				DesiredCapabilities capabilityCh = DesiredCapabilities.chrome();
				driver = new RemoteWebDriver(_url, capabilityCh);
				break;
			case "opera":
				DesiredCapabilities capabilityOpera = DesiredCapabilities.operaBlink();
				driver = new RemoteWebDriver(_url, capabilityOpera);
				break;
			case "chrome_mobile":
				Map<String, Object> mobileEmulation = new HashMap<String, Object>();
				mobileEmulation.put("deviceName", "Nexus 5");
				Map<String, Object> chromeOptions = new HashMap<String, Object>();
				chromeOptions.put("mobileEmulation", mobileEmulation);
				DesiredCapabilities capabilityMob = DesiredCapabilities.chrome();
				capabilityMob.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
				driver = new RemoteWebDriver(_url, capabilityMob);
				break;
			case "ie":
				DesiredCapabilities capabilityIe = DesiredCapabilities.internetExplorer();
				capabilityIe.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
				capabilityIe.setJavascriptEnabled(true);
				capabilityIe.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
				capabilityIe.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY, true);
				capabilityIe.setCapability("enableElementCacheCleanup", false);
				capabilityIe.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				driver = new RemoteWebDriver(_url, capabilityIe);
				break;
			case "edge":
				DesiredCapabilities capabilityEdge = DesiredCapabilities.edge();
				driver = new RemoteWebDriver(_url, capabilityEdge);
				break;
			default:
				System.out.println("please select the right browser!");
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return driver;
	}

}
