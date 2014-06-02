package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    @Test
    public void shouldGetConnection() {

        //WebDriver driver = new HtmlUnitDriver();
        WebDriver driver = new FirefoxDriver();

        //driver.get("http://www.google.com");
        driver.navigate().to("http://www.sportsbet.com.au/");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.tagName("mm-sports"));
        element.submit();
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}