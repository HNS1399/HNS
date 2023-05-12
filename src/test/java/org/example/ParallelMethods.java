package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelMethods {


    @Test
    public void chrome(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");


    }

    //@Test
   // public  void edge() {

      //  System.setProperty("webdriver.edge.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\edgedriver_win32 (1)\\msedgedriver.exe");
    //   WebDriver driver = new EdgeDriver();
       //driver.get("https://www.facebook.com/login/");
   // }

    @Test
   public  void firefox() {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\micffr\\Downloads\\Telegram Desktop\\geckodriver-v0.33.0-win64\\geckodriver.exe");
           WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/login/");


   }


}
