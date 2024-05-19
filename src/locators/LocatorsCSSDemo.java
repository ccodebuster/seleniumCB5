package locators;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorsCSSDemo  extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setupTest(){
        openBrowser(baseUrl);
    }


    @Test
    public void login(){
        //Css selector-----> tagName[attribute=value]
        driver.findElement(By.cssSelector("input[id=small-searchterms]")).sendKeys("mobile");
        driver.findElement(By.cssSelector("input[id=small-searchterms]")).clear();

        // tagName#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("computers");
        driver.findElement(By.cssSelector("input#small-searchterms")).clear();

        //tagName.classname
        driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).sendKeys("bike");
        driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).clear();




    }

    @After
    public void tearDown(){

        //closeBrowser();
    }
}
