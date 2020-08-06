package com.rupali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","D:\\Rupali_work\\tools\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();

    }
}
