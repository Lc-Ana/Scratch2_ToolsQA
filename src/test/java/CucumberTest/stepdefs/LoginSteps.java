package CucumberTest.stepdefs;

import CucumberTest.helpers.Credentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginSteps {
    private static WebDriver driver = null;

    @Given("User launched the app")
    public void user_launched_the_app() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user is on default page of the app")
    public void user_is_on_default_page_of_the_app() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.saucedemo.com/");

    }

    @When("user introduces the valid credentials")
    public void user_introduces_the_valid_credentials(List<Credentials> userCredentials) {
        // Write code here that turns the phrase above into concrete actions
        for (Credentials credentials : userCredentials) {
            driver.findElement(By.id("user-name")).sendKeys(credentials.getUsername());
            driver.findElement(By.id("password")).sendKeys(credentials.getPassword());
            driver.findElement(By.id("login-button")).click();
        }
    }

//    @When("clicks on Login button")
//    public void clicks_on_login_button() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.id("login-button")).click();
//    }

    @Then("user lands on homepage")
    public void user_lands_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitleOfHomePage = driver.getTitle();
        String expectedTitle = "Swag Labs";
        if (expectedTitle.equals(actualTitleOfHomePage)) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login UNSuccessfully");
        }
    }

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        System.out.println("Logout Successfully!");//to delete after
    }

//    @Then("user lands on login page")
//    public void user_lands_on_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Logout Successfully!");
//        driver.quit();
//    }
}
