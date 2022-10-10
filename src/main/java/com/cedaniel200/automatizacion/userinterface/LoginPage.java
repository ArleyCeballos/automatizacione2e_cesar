package com.cedaniel200.automatizacion.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cedaniel200.automatizacion.userinterface.MenuPage.pag;

public class LoginPage {

    private LoginPage() {
    }

    public static final WebElement USERNAME = pag.findElement(By.id("loginusername"));
    public static final WebElement PASSWORD = pag.findElement(By.id("loginpassword"));
    public static final WebElement LOG_IN_BUTTON = pag.findElement(By.linkText("//*[@id='logInModal']//button[@class='btn btn-primary']"));

}
