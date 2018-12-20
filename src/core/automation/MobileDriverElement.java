package core.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MobileDriverElement implements IElement {
	AppiumDriver<MobileElement> driver;
	
	public MobileDriverElement(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	@Override
	public WebElement getElementById(String id) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
		return driver.findElement(By.id(id));
	}

}
