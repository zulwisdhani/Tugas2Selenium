package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Main {
    static WebDriver driver;
    static LoginPage loginPage = new LoginPage();
//    static CartPage cartPage = new CartPage();

    public static void main(String[] args) {

        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/n");

         loginPage.login("sindy","$Sindy1999");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DriverSingleton.closeObjectInstance();
    }
}
