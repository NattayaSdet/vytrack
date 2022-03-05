package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

     /*
    Creating a private constructor so we are closing access to the object
     of this class from outside of the class
     */


    private Driver(){


    }
    /*
    We make WebDriver private because we want to close access from outside of the class.
    We make it static because we will use it in a static method.
     */
    private static WebDriver driver;

    /*
    Create a reusable utility method which will return sam driver instance when we call it.
     */
    public static WebDriver getDriver(){

        if(driver== null){

            /*
            We read our browser teype from configuration.properties.
            This way we can control which browser is opened fro outside our code., from configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;

    }

    public static void closDriver(){
        if(driver!=null){
            driver.quit();
            driver = null;
        }
    }
}

