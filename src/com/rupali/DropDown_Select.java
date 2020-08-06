package com.rupali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.name("firstName")).sendKeys("Ram");
        driver.findElement(By.name("lastName")).sendKeys("Verma");
        driver.findElement(By.name("phone")).sendKeys("12234567890");
        driver.findElement(By.id("userName")).sendKeys("ramverma@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("xyz,pql,abcd road");
        driver.findElement(By.name("city")).sendKeys("Jersey City");
        driver.findElement(By.name("state")).sendKeys("Jersey");
        driver.findElement(By.name("postalCode")).sendKeys("07310");
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("JERSEY");


    }
}
