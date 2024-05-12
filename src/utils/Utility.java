package utils;

import browserTesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Utility extends BaseTest {

    public void clickOnElement(By by){
      WebElement element = driver.findElement(by);
      element.click();
    }

}
