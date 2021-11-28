package ydcc.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ydcc.keyword.UIKeywords;

public class BaseClassN {
	UIKeywords keyword = UIKeywords.getInstance();
	public static RemoteWebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		keyword.openBrowser("chrome");
		BaseClassN.driver = keyword.getDriver();
	}

	@AfterMethod
	public void tearDown() {
		keyword.quitBrowser();
		System.out.println("Closing browserRRR");
	}

}
