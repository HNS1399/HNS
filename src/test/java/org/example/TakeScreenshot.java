package org.example;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    @Test
    public void takeSS() throws IOException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationexercise.com/");


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Files.copy(screenshot , new File("C:\\Users\\micffr\\OneDrive\\Pictures\\chr.PNG"));








    }
}
