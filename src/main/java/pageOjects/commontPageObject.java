package pageOjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.commonPageUI;

public class commontPageObject extends AbstractPage {
	WebDriver driver;

	public commontPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputValueRegister(String value, String values) {
		waitToElementVisible(driver, commonPageUI.DYNAMIC_TEXTBOX, values);
		sendkeyToElement(driver, commonPageUI.DYNAMIC_TEXTBOX, value, values);
	}
}