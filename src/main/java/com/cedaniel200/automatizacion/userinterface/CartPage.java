package com.cedaniel200.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cedaniel200.automatizacion.userinterface.MenuPage.pag;

public class CartPage {

    private CartPage() {
    }
    public static final WebElement PLACE_ORDER_BUTTON = pag.findElement(By.linkText("//button[text()='Place Order']"));
}
