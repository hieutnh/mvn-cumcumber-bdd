package Nopcommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.DataHelper;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageOjects.PageGeneratorManager;
import pageOjects.registerPageObject;

public class RegisterPageSteps {
	WebDriver driver;
	registerPageObject registerPage;
	public DataHelper data;
	public static String pass, email;

	public RegisterPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		data = DataHelper.getData();
		pass = data.getPassword();
		email = data.getEmail();
	}

	@When("^Input to firstname$")
	public void inputToFirstname() {
		registerPage.inputToFirstName(data.getFirstName());

	}

	@When("^Input to lastname$")
	public void inputToLastname() {
		registerPage.inputToLastName(data.getLastName());
	}

	@When("^Input email to textbox$")
	public void inputEmailToTextbox() {
		registerPage.inputEmailToTextBox(email);
	}

	@When("^Input password to textbox$")
	public void inputPasswordToTextbox() {
		registerPage.inputPassToTextBox(pass);
	}

	@When("^Input Confirm password to textbox$")
	public void inputConfirmPasswordToTextbox() {
		registerPage.inputConfirmPassToTextBox(pass);
	}

	@When("^Click register button$")
	public void clickRegisterButton() {
		registerPage.clickRegisterButton();
	}

	@When("^Click button logout$")
	public void clickButtonLogout() {
		registerPage.clickToLogOutButton();
	}

	@When("^Click register button dynamic$")
	public void clickRegisterButtonDynamic() {
		registerPage.clickRegisterButton();
	}

	@When("^Click button logout dynamic$")
	public void clickButtonLogoutDynamic() {
		registerPage.clickToLogOutButton();
	}

}
