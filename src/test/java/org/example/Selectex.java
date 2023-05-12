package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selectex {

    @Test
    public  void select() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        // maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        WebElement select = driver.findElement(By.xpath("//select[@name = 'country']"));

        Select sel = new Select(select);

        // select algeria

        sel.selectByIndex(1);

        Thread.sleep(1000);

        // select antaratcia

        sel.selectByVisibleText("ANTARCTICA");

        Thread.sleep(1000);

        // select aruba

        sel.selectByValue("ARUBA");








    }
}
