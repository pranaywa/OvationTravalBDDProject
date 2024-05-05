package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelPage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "(//*[text()='Sign In'])[1]")
	private WebElement signIn;
	
	public TravelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	public String validationTravelPage() {
		wait.until(ExpectedConditions.titleContains("Best Luxury Travel"));
	 String pageTitle = driver.getTitle();
	 return pageTitle;
	}
	public void clickOnSignIn() {
		signIn.click();
	}

}
