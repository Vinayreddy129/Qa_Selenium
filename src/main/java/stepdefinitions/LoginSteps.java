package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Add code to enter username and password
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        // Add code to click login
    }

    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {
        // Validate redirection to homepage
        driver.quit();
    }

}
