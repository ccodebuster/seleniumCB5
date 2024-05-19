package selectdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Utility;

import java.util.List;

public class TestDropDown extends Utility {

    String baseUrl = "https://way2automation.com/way2auto_jquery/index.php";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void test() {
       WebElement dropDown = driver.findElement(By.name("country"));
        Select select = new Select(dropDown);
        //select.selectByValue("Dominica"); //select by value
       // selectByValueFromDropDown(By.name("country"), "Dominica");
       // select.selectByVisibleText("Kenya");
       //select.selectByIndex(7);
        //selectByVisibleTextFromDropDown(By.name("country"),"Kenya");

       List<WebElement> optionsTag= select.getOptions();
        System.out.println(optionsTag.size());  // 239
        System.out.println(optionsTag);
    }

    @Test
    public void test2() {
        WebElement dropDown = driver.findElement(By.name("country"));
        dropDown.click();
         List<WebElement> listOfCountry=driver.findElements(By.xpath("//select[@name='country']/option")); //239
        for(WebElement country: listOfCountry){
            if(country.getText().equalsIgnoreCase("Kenya")){
                System.out.println(country.getText());
                country.click();
            }
        }
    }

    @After
    public void tearDown() {
       // closeBrowser();
    }

}
