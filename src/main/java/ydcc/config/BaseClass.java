package ydcc.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ydcc.keyword.UIKeywords;

public class BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver driver = null;

	@BeforeTest
	public void launchBrowser() {
		keyword.openBrowser("chrome");
		this.driver = keyword.getDriver();

	}

	@AfterTest
	public void tearDown() {
		this.driver = keyword.getDriver();
		keyword.quitBrowser();
		System.out.println("Closing browser");
	}

}
