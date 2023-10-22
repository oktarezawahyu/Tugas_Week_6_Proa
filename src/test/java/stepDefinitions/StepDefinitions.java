package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // Your code for navigating to the login page
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        // Your code for entering username and password
    }

    @When("User enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        // Your code for entering invalid username and password
    }

    @When("Clicks on login button")
    public void clicks_on_login_button() {
        // Your code for clicking the login button
    }

    @Then("User should be navigated to the home page")
    public void user_should_be_navigated_to_the_home_page() {
        // Your code for verifying the home page navigation
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {
        // Your code for verifying the error message
    }
}
