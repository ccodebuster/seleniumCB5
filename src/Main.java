import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {

       // WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();


        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        // WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement textBox = driver.findElement(By.id("my-text-id"));
        textBox.sendKeys("selenium");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        WebElement message = driver.findElement(By.className("display-6"));
        String displayMessage = message.getText();
        System.out.println(displayMessage);

        driver.quit();


    }

}