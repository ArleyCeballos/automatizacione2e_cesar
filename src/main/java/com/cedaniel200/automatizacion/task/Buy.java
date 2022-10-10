package com.cedaniel200.automatizacion.task;

import com.cedaniel200.automatizacion.model.ActorS;
import com.cedaniel200.automatizacion.model.Purchaser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.cedaniel200.automatizacion.model.Purchaser.PURCHASER_INFORMATION;
import static com.cedaniel200.automatizacion.userinterface.CartPage.PLACE_ORDER_BUTTON;
import static com.cedaniel200.automatizacion.userinterface.MenuPage.CART_MENU;
import static com.cedaniel200.automatizacion.userinterface.MenuPage.pag;
import static com.cedaniel200.automatizacion.userinterface.PlaceOrderPage.*;

public class Buy /*implements Task*/ {

    //@Override
   /* public <T extends Actor> void performAs(T actor) {

            */
    public static void Esperar(WebElement driver){
        WebElement espera = new WebDriverWait(pag, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(driver));
    }

    public static  <T extends ActorS> void buy(T actor) {
        Purchaser purchaser = actor.recall(PURCHASER_INFORMATION);
        /*
        *WaitUntil.the(PLACE_ORDER_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
        *Click.on(PLACE_ORDER_BUTTON),
        * WaitUntil.the(NAME, isVisible()).forNoMoreThan(10).seconds(),
        * Enter.theValue(purchaser.getName()).into(NAME),
        * Enter.theValue(purchaser.getCountry()).into(COUNTRY),
        * Enter.theValue(purchaser.getCity()).into(CITY),
        * Enter.theValue(purchaser.getCard()).into(CARD),
        * Enter.theValue(purchaser.getMonth()).into(MONTH),
        * Enter.theValue(purchaser.getYear()).into(YEAR),
        * Click.on(PURCHASE_BUTTON)
        * */
        CART_MENU.click();
        Esperar(PLACE_ORDER_BUTTON);
        PLACE_ORDER_BUTTON.click();
        Esperar(NAME);
        NAME.sendKeys(purchaser.getName());
        COUNTRY.sendKeys(purchaser.getCountry());
        CITY.sendKeys(purchaser.getCity());
        CARD.sendKeys(purchaser.getCard());
        MONTH.sendKeys(purchaser.getMonth());
        YEAR.sendKeys(purchaser.getYear());
        PURCHASE_BUTTON.click();
    }

  /*  public static Buy buy(){
       return instrumented(Buy.class);
    }

   */
}
