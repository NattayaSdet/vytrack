package com.vytrack.utilities;

import org.openqa.selenium.By;

public class VytrackUtils {

    public static void login(String userName, String password) {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(userName);
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

    }

    public static void loginTruckDriver() {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("driver_password");

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

    }

    public static void loginStoreManager() {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("store_manager_password");

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

    }

    public static void loginAsSalesManager() {
        //go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        //pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        //pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys("sales_manager_password");

        //click login button
        Driver.getDriver().findElement(By.tagName("button")).click();

    }
}
