package bl.mobile.android.nativeactions;

import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class NativeAction {
	private AppiumDriver<MobileElement> driver;
	private LogResults log;

	public NativeAction(AppiumDriver<MobileElement> driver, LogResults log) {
		this.log = log;
		this.driver = driver;
	}
	
	public void clickBackButton() {
		log.startStep("click android 'Back' button");
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		log.endStep(); 
	}
	
	public void clickVolumeDownButton() {
		log.startStep("click android 'Volume Down' button");
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
		log.endStep();
	}
}
