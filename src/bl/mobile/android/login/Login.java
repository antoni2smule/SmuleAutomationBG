package bl.mobile.android.login;

import bl.mobile.android.Base;
import core.reports.LogResults;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Login extends Base{
	private LoginElement element;
	private LogResults log;

	public Login(AppiumDriver<MobileElement> driver,LogResults log) {
		super(driver);
		this.log = log;
		this.element = new LoginElement(mobileElement);
	}

	public void clickCreateAccountWithEmailLink() {
		this.log.startStep("click on the 'Create account with email' hyperlink ");
		this.element.createAccountWitEmailElement().click();
		log.endStep();
	}

	public void clickLoginHyperLink() {
		log.startStep("click on the 'Login' hyperlink");
		this.element.loginHyperLinkElement().click();
		log.endStep();
	}

	public void typeEmail(String email) {
		log.startStep("type in '" + email + "' in the email text field");
		this.element.emailTextFieldElement().sendKeys(email);
		log.endStep();
	}

	public void typePassword(String password) {
		log.startStep("type in '*********' in the password text field");
		this.element.passwordTextFieldElement().sendKeys(password);
		log.endStep();
	}

	public void clickLoginButton() {
		log.startStep("click on the 'Login' button");
		this.element.loginButtonElement().click();
		log.endStep();
	}

	public void clickLoginWithHyperLinkButton() {
		log.startStep("click on the 'Login' hyperlink for the login with func");
		this.element.loginWithHyperLinkElement().click();
		log.endStep();

	}

	public void clickLoginWithEmailButton() {
		log.startStep("click on the 'Email' option for the login with menu");
		this.element.LoginWithEmailButtonElement();
		log.endStep();
	}
}
