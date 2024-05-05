package pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "(//*[text()='Other Services'])[2]")
	private WebElement otherServicesLink;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void selectOtherService() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",otherServicesLink);
		String parentId =  driver.getWindowHandle();
		Set<String> winId = driver.getWindowHandles();
		for(String id:winId) {
			if(!parentId.equals(id)) {
				driver.switchTo().window(id);
			}
		}
	}
	
	
}
