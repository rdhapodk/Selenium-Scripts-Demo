package com.rupali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

    public static void main(String args[])

    {
        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        //if frame name is known
      /*  driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("html/body/a/img")).click();
       // driver.findElement(By.tagName("iframe"));*/

        //if frame index is not known
        int size = driver.findElements(By.tagName("iframe")).size();

        for(int i=0; i<size; i++)
        {
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath("html/body/a/img")).size();
            System.out.println(total);
            driver.switchTo().defaultContent();
        }

        driver.switchTo().frame(1);
        driver.findElement(By.xpath("html/body/a/img")).click();

        driver.quit();
    }
}
