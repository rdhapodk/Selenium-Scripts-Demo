package com.rupali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowHandle {

    public static void main (String args[])
    {

        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();

        String parentWindow = it.next();
        System.out.println("Parent window id is -" +parentWindow);

        String childWindow = it.next();
        System.out.println("Child window is - " +childWindow);

        driver.switchTo().window(parentWindow);
        System.out.println("Window Title :-" +driver.getTitle());

        driver.switchTo().window(childWindow);
        System.out.println("Window Title :-" +driver.getTitle());

    }



}
