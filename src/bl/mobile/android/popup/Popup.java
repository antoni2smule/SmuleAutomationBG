package bl.mobile.android.popup;

import bl.mobile.android.Base;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Popup extends Base{

	private PopupElement element;
	private LogResults log;

	public Popup(AppiumDriver<MobileElement> driver, LogResults log) {
		super(driver);
		this.log = log;
		this.element=new PopupElement(mobileElement);
	}

	public void clickConfirmYesButton() {
		log.startStep("click the confirm 'Yes' button");
		this.element.confirmYesButtonElement().click();
		log.endStep();
	}

	public void clickConfirmAllowButton() {
		log.startStep("click the confirm 'Allow' button");
		this.element.confirmAllowButtonElement().click();
		log.endStep();
	}
	
	public void clickIsThisYouNoButton() {
		log.startStep("click 'No' button from the 'Is this you' popup");
		this.element.isthisYouNoButtonElement().click();
		log.endStep();
	}
	
	public void clickCoachmarkTooltip() {
		log.startStep("click 'Coachmark tooltip' after initial login");
		this.element.coachmarkTooltipElement().click();
		log.endStep();
	}

}
