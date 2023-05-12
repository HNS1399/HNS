package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll {

    @Test
    public  void scroll() {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationexercise.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement trending = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]"));

      //  js.executeScript("arguments[0].scrollIntoView(true);", trending);

        // scroll down

        js.executeScript("window.scrollBy(0 , 2000)" , "");

        // scroll up

       js.executeScript("window.scrollBy(0 , -800)" , "");






    }
}
