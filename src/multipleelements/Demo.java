package multipleelements;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Demo extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }


    @Test
    public void login() {

       List<WebElement> linkOfTabs = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li"));
        System.out.println(linkOfTabs.size()); //7
        System.out.println(linkOfTabs); //print all webelement and not actual text

        for(WebElement tab:linkOfTabs){
            if(tab.getText().equalsIgnoreCase("books")){
                System.out.println(tab.getText());
            }

        }

    }

    @After
    public void tearDown() {

        //closeBrowser();
    }
}
