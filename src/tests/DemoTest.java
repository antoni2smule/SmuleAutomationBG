package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import factory.SmuleObjectFactory;

public class DemoTest {
	private SmuleObjectFactory smule;

	@Parameters({ "deviceName", "version" })
	@Test(groups = { "end-to-end", "version" })
	public void endToEndTest(@Optional("Galaxy J5") String deviceName, @Optional("8.1.0") String version)
			throws InterruptedException {
		smule = new SmuleObjectFactory("config/config","Galaxy j5","8.1.0");
		smule.log.startTest("verify that user can login, search a song, play it, like it and then stop it");
		try {
			smule.popup.clickIsThisYouNoButton();

			smule.login.clickCreateAccountWithEmailLink();
			smule.login.clickLoginHyperLink();
			smule.login.typeEmail("iliyasmule@mailinator.com");
			smule.login.typePassword("123456");
			smule.login.clickLoginButton();

			smule.popup.clickConfirmYesButton();
			smule.popup.clickConfirmAllowButton();
			smule.popup.clickCoachmarkTooltip();

			// smule.nativeAction.clickBackButton();

			smule.bottomBarMenu.clickFeedButton();

			smule.feed.clickCallSongFromTheFeed();

			smule.songInProgress.clickToExpandSongInProgress();
			smule.songInProgress.clickLoveSongInProgress();
			smule.songInProgress.clickCollapseSongInProgress();
			smule.songInProgress.clickPauseSongInProgressFromMinibar();

			smule.log.verifyTestStatus();
		} catch (Exception e) {
			smule.log.endStep(false);

		} finally {
			smule.log.endTest();
			smule.mobileDriver.resetApp();
			smule.mobileDriver.quit();
		}
	}

	@Parameters({ "deviceName", "version" })
	@Test(groups = { "end-to-end" })
	public void negativeTest(String deviceName, String version) throws InterruptedException {
		smule = new SmuleObjectFactory("config/config", deviceName, version);
		smule.log.startTest("verify that user can't login with a wrong password");
		try {
			smule.popup.clickIsThisYouNoButton();
			smule.login.clickCreateAccountWithEmailLink();
			smule.login.clickLoginHyperLink();
			smule.login.typeEmail("iliyasmule@mailinator.com");
			smule.login.typePassword("notCorrectPassword");
			smule.login.clickLoginButton();

			smule.popup.clickConfirmYesButton();

			smule.log.verifyTestStatus();
		} catch (Exception e) {
			smule.log.endStep(false);

		} finally {
			smule.log.endTest();
			smule.mobileDriver.resetApp();
			smule.mobileDriver.quit();
		}
	}

}
