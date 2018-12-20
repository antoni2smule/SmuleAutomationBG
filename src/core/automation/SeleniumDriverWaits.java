package core.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriverWaits {

	private EventFiringWebDriver driver;

	public int pageLoadTimeOut;
	public int ajaxTimeOut;
	public int elementTimeOut;
	public int elementNegativeTimeOut;
	public int sikuliTimeOut;
	public int sikuliNegativeTimeOut;

	public SeleniumDriverWaits(EventFiringWebDriver driver, WaitValue waitValue) {
		this.driver = driver;
		this.pageLoadTimeOut = waitValue.getPageLoadTimeOut();
		this.elementTimeOut = waitValue.getElementTimeOut();
		this.elementNegativeTimeOut = waitValue.getElementNegativeTimeOut();
		this.ajaxTimeOut = waitValue.getAjaxTimeOut();
		this.sikuliTimeOut = waitValue.getSikuliTimeOut();
	}

	public void waitForElementTobePresentByXpath(String element, int timeOut) {

		try {
			WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void waitForElementTobePresentByXpath(String xpathLocator) {

		waitForElementTobePresentByXpath(xpathLocator, this.elementTimeOut);
	}

	public void waitForElementTobePresentByID(String element, int timeOut) {

		try {
			WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void waitForElementTobePresentByID(String element) {

		waitForElementTobePresentByID(element, this.elementTimeOut);
	}

	public void waitForElementTobeVisable(WebElement element, int timeOut) {

		try {
			WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public void waitForElementTobeVisible(WebElement element) {

		waitForElementTobeVisable(element, this.elementTimeOut);
	}

	public void waitTillElementIsClickable(WebElement element, int timeOut) {

		try {
			WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public void waitforAlertToBePresent(int timeOut) {

		try {
			WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void waitTillElementIsClickable(WebElement element) {

		waitTillElementIsClickable(element, this.elementTimeOut);
	}

	public void waitForAjaxToComplete(int timeOut) {

		try {
			new WebDriverWait(driver, timeOut) {
			}.until(new ExpectedCondition<Boolean>() {

				@Override
				public Boolean apply(WebDriver driverObject) {
					return (Boolean) ((JavascriptExecutor) driverObject).executeScript("return jQuery.active == 0");
				}
			});
		} catch (Exception e) {
		}
	}


	public boolean waitUntilElementIsClickableCustom(String element, int timeOut) {

		for (int i = 0;; i++) {
			if (i >= timeOut)
				return (false);
			try {
				WebDriverWait wait = new WebDriverWait(driver, timeOut);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
				return (true);
			} catch (Exception e) {
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
