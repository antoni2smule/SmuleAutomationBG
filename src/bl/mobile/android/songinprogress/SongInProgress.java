package bl.mobile.android.songinprogress;

import bl.mobile.android.Base;
import core.automation.MobileDriverElement;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SongInProgress extends Base{
	private SongInProgressElement element;
	private LogResults log;

	public SongInProgress(AppiumDriver<MobileElement> driver, LogResults log) {
		super(driver);
		this.log = log;
		this.element = new SongInProgressElement(mobileElement);
	}
	
	public void clickToExpandSongInProgress() {
		this.log.startStep("click on the mini bar in order to exapnd the song which is playing at the momment");
		this.element.clickOpenSongInProgressElement().click();
		log.endStep();
	}
	
	public void clickLoveSongInProgress() {
		this.log.startStep("click on the 'Love' button to favourite the current playing song");
		this.element.clickLoveSongInProgress().click();
		log.endStep();
	}
	
	public void clickCollapseSongInProgress() {
		this.log.startStep("click on the arrow down button to collapse the current playing song");
		this.element.clickCollapseSongInProgressElement().click();
		log.endStep();
	}
	
	public void clickPauseSongInProgressFromMinibar() {
		this.log.startStep("click on the 'Pause' button to pause the current playing song");
		this.element.clickPauseSongInProgressFromMinibarElement().click();
		log.endStep();
	}
}
