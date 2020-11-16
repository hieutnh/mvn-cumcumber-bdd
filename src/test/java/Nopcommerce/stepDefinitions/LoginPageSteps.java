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

	@When("^Click button login to home page dynamic$")
	public void clickButtonLoginToHomePageDynamic() {
		loginPage.clicktoLoginButton();
	}
}
