package com.rupali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverActions {

    public static void main (String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        String title = driver.getTitle();
        System.out.println(title);

        Actions action = new Actions(driver);
         //WebElement  el=driver.findElement(By.linkText("Airports"));
        try{
        WebElement  el=driver.findElement(By.linkText("ADD-ONS"));
        Thread.sleep(10000);
        action.moveToElement(el).build().perform();
            Thread.sleep(3000);
        }catch(InterruptedException e ){
            e.printStackTrace();
        }

      Thread.sleep(3000);
        driver.findElement(By.linkText("Hot Meals")).click();


    }
}
