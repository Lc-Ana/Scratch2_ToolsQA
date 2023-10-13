package CucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Seleniumtest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        //create an instance of chromedriver
        driver = new ChromeDriver();
        //Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize the window, otherwise could appear an error, driver do not find the elements
        driver.manage().window().maximize();
        //Launch the Online Store Website
        driver.get("https://www.saucedemo.com/");
        //Enter UserName and Password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click on the LogIn link
        driver.findElement(By.id("login-button")).click();
        //Print a successful message
        System.out.println("Login Successfully");
        //LogOut from the application
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        //Print a successful message
        System.out.println("Logout Successfully!");
        //Close the Browser
        driver.quit();
    }
}
