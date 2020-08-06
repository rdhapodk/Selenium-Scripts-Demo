package com.rupali;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

public static void main(String args[])
{
    System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    String title = driver.getTitle();
    System.out.println(title);
    driver.findElement(By.name("proceed")).click();
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    String text = alert.getText();
    if(text.equals(("Please enter a valid user name")))
    {
        System.out.println("Valid popup message");
    }
    else
    {
        System.out.println("Invalid popup message");
    }
    alert.accept();
}
}
