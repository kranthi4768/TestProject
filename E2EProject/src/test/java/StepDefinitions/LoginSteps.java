package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on loging page")
	public void user_is_on_loging_page() {
		System.out.println("user is on loginging page");
	}

	@When("user enters username and password")
	public void user_enters_usernsme_and_password() {
		System.out.println("user enters usermane and passeord");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("clicked on login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("user is navigated to the home page");
	}


}
