package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    private WebDriver driver;
    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByVisibleText("Black");
        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByVisibleText("37");
        driver.findElement(By.xpath("//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/button")).click();
    }
}

