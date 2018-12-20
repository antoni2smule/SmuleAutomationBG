package bl.mobile.android.login;

import org.openqa.selenium.WebElement;

import core.automation.MobileDriverElement;

public class LoginElement {
	private MobileDriverElement element;

	public LoginElement(MobileDriverElement element) {
		this.element = element;
	}

	public WebElement createAccountWitEmailElement() {
		return element.getElementById("com.smule.singandroid:id/connect_with_email");
	}

	public WebElement loginHyperLinkElement() {
		return element.getElementById("com.smule.singandroid:id/login_button");
	}

	public WebElement emailTextFieldElement() {
		return element.getElementById("com.smule.singandroid:id/email_editText");
	}

	public WebElement passwordTextFieldElement() {
		return element.getElementById("com.smule.singandroid:id/password_editText");
	}

	public WebElement loginButtonElement() {
		return element.getElementById("com.smule.singandroid:id/login_button");
	}

	public WebElement loginWithHyperLinkElement() {
		return element.getElementById("com.smule.singandroid:id/login_text");
	}

	public WebElement LoginWithEmailButtonElement() {
		return element.getElementById("com.smule.singandroid:id/email_button_view");
	}

}
