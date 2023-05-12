package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class HelperClass1 {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static String remote_url = "http://localhost:4444";
    @BeforeMethod
    public void setDriver() throws MalformedURLException, InterruptedException{

        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        driver.get().manage().window().maximize();

        Thread.sleep(1000);

        // driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divUsername']/span")));
    }
    public WebDriver getDriver() {
        return driver.get();
    }
    @AfterMethod
    public void closeBrowser() {
        driver.get().quit();
        driver.remove();
    }

}echo "# HNS" >> README.mdecho "# HNS" >> README.md
