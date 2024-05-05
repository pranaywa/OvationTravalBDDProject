package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUppage {
 WebDriver driver;
WebDriverWait wait;

@FindBy(xpath = "//*[@id='email']")
private WebElement email;
@FindBy(css = "input#givenName")
private WebElement firstName;
@FindBy(xpath = "//*[@id='surname']")
private WebElement lastName;
@FindBy(xpath = "//*[@id='newPassword']")
private WebElement password;
@FindBy(xpath = "//*[@id='reenterPassword']")
private WebElement cnfPassword;
@FindBy(xpath = "//*[@id='country']")
private WebElement countryDD;
@FindBy(xpath = "//*[@id='continue']")
private WebElement create;
@FindBy(xpath = "(//*[@type='checkbox'])[1]")
private WebElement check1;
@FindBy(xpath = "(//*[@type='checkbox'])[2]")
private WebElement check2;
@FindBy(xpath = "(//*[@type='checkbox'])[3]")
private WebElement check3;

public SignUppage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));

}

public String validateSignUpPage() {
	wait.until(ExpectedConditions.titleContains("Virtuoso | Sign Up"));
	String pageTitle = driver.getTitle();
	return pageTitle;
}
public void enterEmail(String emailV) {
	email.sendKeys(emailV);
}
public void enterfirstName(String FN) {
	firstName.sendKeys(FN);
}
public void enterlastName(String LN) {
	lastName.sendKeys(LN);
}
public void enterPass(String pass) {
	password.sendKeys(pass);
}
public void enterCnfPass(String cnfP) {
	cnfPassword.sendKeys(cnfP);
}
public void clickOnCountryDD() {
	countryDD.click();
}
public void selectIndia() {
	Select sel = new Select(countryDD);
	sel.selectByVisibleText("India");
}
public void selectCheck1() {
	wait.until(ExpectedConditions.visibilityOf(check1));
	check1.click();
}
public void selectCheck2() {
	check2.click();
}
public void selectCheck3() {
	check3.click();
}
public void clickOnCreate() {
	create.click();
}



}
