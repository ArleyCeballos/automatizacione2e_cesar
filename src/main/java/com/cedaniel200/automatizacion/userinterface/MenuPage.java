package com.cedaniel200.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

    public static WebDriver pag;

    private MenuPage() {
    pag.get("https://www.demoblaze.com");
    }


    public static final WebElement CART_MENU = pag.findElement(By.id("cartur"));
    public static final WebElement HOME_MENU = pag.findElement(By.linkText("//a[text()='Home ']"));
    public static final WebElement LOG_IN_MENU = pag.findElement(By.id("login2"));
    public static final WebElement LOG_OUT_MENU = pag.findElement(By.id("logout2"));
}