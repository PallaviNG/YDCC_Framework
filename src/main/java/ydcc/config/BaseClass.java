package ydcc.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import ydcc.keyword.UIKeywords;

public class BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver driver = null;

	@Before
	public void launchBrowser() {
		this.driver = keyword.getDriver();
		keyword.openBrowser("chrome");
	}

	@After
	public void tearDown() {
		this.driver = keyword.getDriver();
		keyword.quitBrowser();
		System.out.println("Closing browser");
	}

}
