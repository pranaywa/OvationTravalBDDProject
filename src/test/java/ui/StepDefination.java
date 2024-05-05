package ui;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignInPage;
import pages.SignUppage;
import pages.TravelPage;
import qa.DriverFactory;

public class StepDefination {
	WebDriver driver;
	HomePage h = new HomePage(DriverFactory.getDriver());
	TravelPage t = new TravelPage(DriverFactory.getDriver());
	SignInPage signIn = new SignInPage(DriverFactory.getDriver());
	SignUppage signUp = new SignUppage(DriverFactory.getDriver());
	
	@Given("user is at home page")
	public void user_is_at_home_page() {
		driver = DriverFactory.getDriver();
		driver.get("https://www.ovationtravel.com/home");
		driver.manage().window().maximize();
	}

	@When("user click on other services link")
	public void user_click_on_other_services_link() {
		h.selectOtherService();
	}

	@Then("user navigates to travel page")
	public void user_navigates_to_travel_page() {
     		String title = t.validationTravelPage();
     		assertEquals(title.contains("World's Best Luxury Travel"),true);
	}

	@When("user click on signIn button")
	public void user_click_on_sign_in_button() {
		t.clickOnSignIn();
	}

	@Then("user navigates to signIn page")
	public void user_navigates_to_sign_in_page() {
		String title = signIn.validateSignInPage();
		assertEquals(title.contains("Virtuoso | Sign In"),true);
	}

	@When("user click on sign up here link")
	public void user_click_on_sign_up_here_link() {
		signIn.clickOnSignUpHere();
	}

	@Then("user navigate to signUp page")
	public void user_navigate_to_sign_up_page() {
	String title = signUp.validateSignUpPage();	
	assertEquals(title.contains("Virtuoso | Sign Up"),true);
	}

	@When("user enters the email as <{string}>")
	public void user_enters_the_email_as(String string) {
		signUp.enterEmail(string);
	}

	@When("user enters the firstname as <{string}>")
	public void user_enters_the_firstname_as(String string) {
		signUp.enterfirstName(string);
	}

	@When("user enters the lastname as <{string}>")
	public void user_enters_the_lastname_as(String string) {
		signUp.enterlastName(string);
	}

	@When("user enters the password as <{string}>")
	public void user_enters_the_password_as(String string) {
		signUp.enterPass(string);
	}

	@When("user re enters the password as <{string}>")
	public void user_re_enters_the_password_as(String string) {
		signUp.enterCnfPass(string);
	}

	@When("user click on country dropdown")
	public void user_click_on_country_dropdown() {
		signUp.clickOnCountryDD();
	}

	@When("user select country as india")
	public void user_select_country_as_india() {
		signUp.selectIndia();
	}

	@When("user select the term and condition checkbox")
	public void user_select_the_term_and_condition_checkbox() {
		signUp.selectCheck1();
	}

	@When("user select the personal information checkbox")
	public void user_select_the_personal_information_checkbox() {
		signUp.selectCheck2();
	}

	@When("user select the ocation travel checkbox")
	public void user_select_the_ocation_travel_checkbox() {
		signUp.selectCheck3();
	}

	@When("user click on create button")
	public void user_click_on_create_button() {
		signUp.clickOnCreate();
	}

}
