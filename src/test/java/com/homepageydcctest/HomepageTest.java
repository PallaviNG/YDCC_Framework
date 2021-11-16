package com.homepageydcctest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ydcc.config.BaseClass;
import ydcc.keyword.UIKeywords;

public class HomepageTest {
	UIKeywords keyword = UIKeywords.getInstance();

	@Given("The chrome browser is launched")
	public void the_chrome_browser_is_launched() {
	}

	@And("The Url of app is also launched")
	public void the_url_of_app_is_also_launched() {
		keyword.launchURL("http://143.110.249.55");
	}

	@Then("verify title of the pages")
	public void verify_title_of_the_pages() {
		String actual = "Yavatmal District Central Co-Operative Bank Limited";
		String exepected = keyword.getTitleOfPage();
		Assert.assertEquals(actual, exepected);
	}

	@Given("Click on the Register Btn")
	public void click_on_the_register_btn() {
		keyword.launchURL("http://143.110.249.55");
		WebElement btnRegister = keyword.getWebElement("css", "a[href='/reg-instruction']");
		btnRegister.click();
	}

	@Then("verify title of the register page")
	public void verify_title_of_the_register_page() {
		String title = keyword.getTitleOfPage();
		String actualTitle = "Instruction Page";
		Assert.assertEquals(actualTitle, title);
	}

	@And("verify current URL")
	public void verify_current_url() {
		String expectedUrl = keyword.getCurrentURL();
		String actualUrl = "http://143.110.249.55/reg-instruction";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Given("Click on CheckBox")
	public void click_on_check_box() {
		keyword.launchURL("http://143.110.249.55/reg-instruction");
		WebElement agree = keyword.getWebElement("css", "input#i-agree");
		keyword.click(agree);
	}

	@And("Click Here to Proceed Btn")
	public void click_here_to_proceed_btn() {
		WebElement btntoProceed = keyword.getWebElement("css", "button#proccessNewReg");
		btntoProceed.click();
	}

	@Then("verify title of the registration Form")
	public void verify_title_of_the_registration_form() {
		String actualTitle = keyword.getTitleOfPage();
		String expectedTittle = "New User Registration";
		Assert.assertEquals(actualTitle, expectedTittle);
	}
}
