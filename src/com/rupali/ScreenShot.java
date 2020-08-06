package com.rupali;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {

    public static void main(String args[]) throws IOException {

        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        //convert webdriver object to takesScreenShot

        TakesScreenshot srcshot = ((TakesScreenshot)driver);

        //Call getscreenshotAs method to create file

        File src = srcshot.getScreenshotAs(OutputType.FILE);

        //move file to destination

        File dest = new File("D:\\Rupali_work\\code\\selenium_Test\\src\\com\\rupali.google.png");


        //Copy file from scource to destination
        FileUtils.copyFile(src,dest);


    }
}
