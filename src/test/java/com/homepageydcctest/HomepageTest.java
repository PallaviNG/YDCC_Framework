package com.homepageydcctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageTest {
	public RemoteWebDriver driver = null;

	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	@Given("The chrome browser is launched")
	public void the_chrome_browser_is_launched() {
	}

	@And("The Url of app is also launched")
	public void the_url_of_app_is_also_launched() {
launchUrl("http://143.110.249.55");
	}

	@Then("verify title of the pages")
	public void verify_title_of_the_pages() {
		String actual = "Yavatmal District Central Co-Operative Bank Limited";
		String exepected = driver.getTitle();
		Assert.assertEquals(actual, exepected);
	}

	@Given("Click on the Register Btn")
	public void click_on_the_register_btn() {
		launchUrl("http://143.110.249.55");
		WebElement btnRegister = driver.findElement(By.cssSelector("a[href='/reg-instruction']"));
		btnRegister.click();
	}

	@Then("verify title of the register page")
	public void verify_title_of_the_register_page() {
		String title = driver.getTitle();
		String actualTitle = "Instruction Page";
		Assert.assertEquals(actualTitle, title);
	}

	@And("verify current URL")
	public void verify_current_url() {
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "http://143.110.249.55/reg-instruction";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Given("Click on CheckBox")
	public void click_on_check_box() {
		launchUrl("http://143.110.249.55/reg-instruction");
		WebElement agree = driver.findElement(By.cssSelector("input#i-agree"));
		agree.click();
	}

	@And("Click Here to Proceed Btn")
	public void click_here_to_proceed_btn() {
		WebElement btntoProceed = driver.findElement(By.cssSelector("button#proccessNewReg"));
		btntoProceed.click();
	}

	@Then("verify title of the registration Form")
	public void verify_title_of_the_registration_form() {
		String actualTitle = driver.getTitle();
		String expectedTittle = "New User Registration";
		Assert.assertEquals(actualTitle, expectedTittle);
	}
}
