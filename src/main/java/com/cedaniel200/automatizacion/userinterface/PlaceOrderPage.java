package com.cedaniel200.automatizacion.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cedaniel200.automatizacion.userinterface.MenuPage.pag;

public class PlaceOrderPage {

    private PlaceOrderPage() {
    }

    public static final WebElement NAME = pag.findElement(By.id("name"));
    public static final WebElement COUNTRY = pag.findElement(By.id("country"));
    public static final WebElement CITY = pag.findElement(By.id("city"));
    public static final WebElement CARD = pag.findElement(By.id("card"));
    public static final WebElement MONTH = pag.findElement(By.id("month"));
    public static final WebElement YEAR = pag.findElement(By.id("year"));

    public static final WebElement PURCHASE_BUTTON = pag.findElement(By.linkText("//button[text()='Purchase']"));

    public static final WebElement MESSAGE_SUCCESS_PURCHASE = pag.findElement(By.linkText("//h2[text()='Thank you for your purchase!']"));
}
