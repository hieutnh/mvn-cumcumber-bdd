package Nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageOjects.PageGeneratorManager;
import pageOjects.homePageObject;

public class HomePageSteps {
	WebDriver driver;
	String homePageUrl;
	homePageObject homePage;
	
	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	
	@Given("^Get current page Url$")
	public void getCurrentPageUrl() {
		homePageUrl = homePage.getCurrentPageUrl();
	}
	
	@When("^Open register page$")
	public void openRegisterPage() {
		homePage.clickToRegisterLink();
	}
	
	@When("^Click button login at login page$")
	public void clickButtonLoginAtLoginPage() {
		homePage.clickToLoginLinkHeader();
	}

}
