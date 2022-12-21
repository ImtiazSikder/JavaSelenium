package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

    public static void main(String[] args){
        System.out.println("This is Dropdown Test");

        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        //Dropdown test
        WebElement ele= driver.findElement(By.id("dropdown"));
        Select select=new Select(ele);
        select.selectByVisibleText("Option 1");





    }
}
