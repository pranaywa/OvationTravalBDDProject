package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	static WebDriver driver;
	
	public WebDriver launchBrowser() {
		driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver getDriver() {
		return driver;
	}
}
