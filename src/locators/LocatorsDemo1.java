package locators;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsDemo1 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }


    @Test
    public void login(){
        //xpath-----> //tagname[@attribute='value']
       // driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //By className
        WebElement loginLink =driver.findElement(By.className("ico-login"));
        loginLink.click();


        //By Id
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("codebuster@gmail.com");

        //By Name
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //By LinkText
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();


    }

    @After
    public void tearDown(){

        //closeBrowser();
    }
}
