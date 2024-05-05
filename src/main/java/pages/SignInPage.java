package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
static WebDriver driver;
WebDriverWait wait;

@FindBy(xpath = "//*[text()='Sign up here.']")
private WebElement signUp;

public SignInPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}

public String validateSignInPage() {
	wait.until(ExpectedConditions.titleContains("Virtuoso | Sign In"));
	String pageTitle = driver.getTitle();
	return pageTitle;
}
public void clickOnSignUpHere() {
	signUp.click();
}





}
