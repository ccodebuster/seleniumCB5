package utils;

import browserTesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Utility extends BaseTest {

    public void clickOnElement(By by){
      WebElement element = driver.findElement(by);
      element.click();
    }

    public void sendTextToElement(By by, String text) {
        WebElement element=driver.findElement(by);
        element.sendKeys(text);
    }

    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
         select.selectByVisibleText(text);
    }

    public void selectByValueFromDropDown(By by, String value){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(value); //select by value
    }


}
