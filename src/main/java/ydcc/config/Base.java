package ydcc.config;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ydcc.keyword.UIKeywords;

public class Base {
	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver driver = null;

	@Before
	public void launchBrowser() {
		keyword.openBrowser("chrome");
		this.driver = keyword.getDriver();

	}

	@After
	public void tearDown() {
		 keyword.quitBrowser();
	}

}
