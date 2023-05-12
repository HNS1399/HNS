package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard {

    @Test
    public void keyboard() {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/login/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

        Actions alt = new Actions(driver);

        Action seriesofactions = alt.moveToElement(username).click().keyDown(username , Keys.SHIFT).sendKeys(username, "Micffr").build();

        seriesofactions.perform();


    }

}
