package Facebook.stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {

	WebDriver driver;

	// input email và pass 2 row
	@Before
	public void OpenApplication() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	@After
	public void closeApplication() {
		driver.quit();
	}

	@When("^Input to username with \"([^\"]*)\"$")
	public void inputToUsernameWith(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@When("^Input to password with \"([^\"]*)\"$")
	public void inputToPasswordWith(String pass) {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@When("^Click to button submit$")
	public void clickToButtonSubmit() {
		driver.findElement(By.name("login")).click();
	}

	// input email và pass cùng 1 row
	@When("^Input to username with \"([^\"]*)\" and password with \"([^\"]*)\"$")
	public void inputToUsernameWithAndPasswordWith(String email, String pass) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);

		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@When("^Input to username and password one time$")
	public void inputToUsernameAndPasswordOneTime(DataTable table) {
		List<Map<String, String>> customer = table.asMaps(String.class, String.class);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(customer.get(0).get("username"));

		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("pasword"));

	}

	@When("^Input to username and password three account")
	public void inputToUsernameAndPasswordAccount(DataTable table) {
		for (Map<String, String> loginInfor : table.asMaps(String.class, String.class)) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(loginInfor.get("username"));

			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(loginInfor.get("pasword"));
		}
	}

	@When("^Click to button login$")
	public void click_to_button_login() {
		driver.findElement(By.name("login")).click();

	}

}
