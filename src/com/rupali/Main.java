package com.rupali;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {
        // write your code here

      /* System.setProperty("webdriver.gecko.driver","D:\\Rupali_work\\tools\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

        //driver.getTitle();
       // driver.findElement(By.xpath("//*[@id=\"fakebox-input\"]")).sendKeys("Pen");
        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        if(title.equals("Google"))
        {
         System.out.println("Valid Title");
        }
        else { System.out.println("Invalid Title");
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("porn");
        //driver.findElement(By.id("fakebox-input")).sendKeys("PAPPU");


        driver.quit();
    }
}