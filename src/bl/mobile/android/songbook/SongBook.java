package bl.mobile.android.songbook;

import bl.mobile.android.Base;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SongBook extends Base{
	private SongBookElement element;
	private LogResults log;
	public SongBook(AppiumDriver<MobileElement> driver,LogResults log) {
		super(driver);
		this.log=log;
		this.element=new SongBookElement(mobileElement);
	}

}
