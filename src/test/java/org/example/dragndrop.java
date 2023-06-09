package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragndrop {

    @Test
    public void Drgndrp() throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        Thread.sleep(500);

        Actions builder = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement dest = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));

        builder.dragAndDrop(source,dest).perform();

        Thread.sleep(500);



    }
}
