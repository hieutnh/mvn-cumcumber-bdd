package Nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageOjects.PageGeneratorManager;
import pageOjects.commontPageObject;

public class CommonPageStep {
	WebDriver driver;
	String homePageUrl;
	commontPageObject commonPage;
	DataHelper data;
	String email;

	public CommonPageStep() {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManager.getCommonPageObject(driver);
		data = DataHelper.getData();
		email = data.getEmail();
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String values, String value) {
		if (values.equals("Email")) {
			value = email;
		} else if (values.equals("FirstName")) {
			value = data.getFirstName();
		} else if (values.equals("LastName")) {
			value = data.getLastName();
		} else {

		}
		commonPage.inputValueRegister(value, values);

	}

	@When("^Input to \"([^\"]*)\" textbox at login page with value \"([^\"]*)\"$")
	public void inputToTextboxAtLoginPageWithValue(String values, String value) {
		if (values.equals("Email")) {
			value = email;
		}
		commonPage.inputValueRegister(value, values);
	}
}
