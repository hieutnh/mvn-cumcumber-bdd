package Nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageOjects.PageGeneratorManager;
import pageOjects.loginPageObject;

public class LoginPageSteps {
	WebDriver driver;
	loginPageObject loginPage;

	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		loginPage = PageGeneratorManager.getLoginPage(driver);
	}


	@When("^Input email to textbox at login page$")
	public void inputEmailToTextboxAtLoginPage() {
		loginPage.inputToEmailTextBox(RegisterPageSteps.email);
	}

	@When("^Input pass to textbox at login page$")
	public void inputPassToTextboxAtLoginPage() {
		loginPage.inputToPasswordTextBox(RegisterPageSteps.pass);
	}

	@When("^Click button login to home page$")
	public void clickButtonLoginToHomePage() {
		loginPage.clicktoLoginButton();
	}
}
