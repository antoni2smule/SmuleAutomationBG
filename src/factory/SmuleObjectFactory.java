package factory;

import java.util.HashMap;
import java.util.Map;

import bl.mobile.android.bottombarmenu.BottomBarMenu;
import bl.mobile.android.feed.Feed;
import bl.mobile.android.login.Login;
import bl.mobile.android.nativeactions.NativeAction;
import bl.mobile.android.popup.Popup;
import bl.mobile.android.songbook.SongBook;
import bl.mobile.android.songinprogress.SongInProgress;
import core.automation.SeleniumDriver;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SmuleObjectFactory {
	public LogResults log;
	public Login login;
	public Popup popup;
	public SongBook songbook;
	public BottomBarMenu bottomBarMenu;
	public Feed feed;
	public SongInProgress songInProgress;
	public NativeAction nativeAction;
	public AppiumDriver<MobileElement> mobileDriver;

	public SmuleObjectFactory(String driverConfig,String deviceName,String version) {

		Map<String, String> androidCap = new HashMap<String, String>();
		androidCap.put("deviceName", deviceName);
		androidCap.put("platformName", "Android");
		androidCap.put("platformVersion", version);
		androidCap.put("appPackage", "com.smule.singandroid");
		androidCap.put("appActivity", ".StartupActivity_");
		//androidCap.put("automationName", "UiAutomator2");

		SeleniumDriver seleniumDriver = new SeleniumDriver(driverConfig);
		mobileDriver = seleniumDriver.getMobileDriver(androidCap);
		mobileDriver.resetApp();
		log = new LogResults();

		login = new Login(mobileDriver, log);
		popup = new Popup(mobileDriver, log);
		songbook = new SongBook(mobileDriver, log);
		bottomBarMenu = new BottomBarMenu(mobileDriver, log);
		feed = new Feed(mobileDriver, log);
		songInProgress = new SongInProgress(mobileDriver, log);
		nativeAction = new NativeAction(mobileDriver, log);
	}
}
