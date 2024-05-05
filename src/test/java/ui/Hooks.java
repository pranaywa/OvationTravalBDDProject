package ui;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class Hooks {
  static WebDriver driver;
	@Before
	public void launchBrowser() {
		DriverFactory f = new DriverFactory();
		f.launchBrowser();
	}
	@After
	public void tearDown() {
    DriverFactory.getDriver().quit();
	}
}
