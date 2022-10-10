package com.cedaniel200.automatizacion.task;

import com.cedaniel200.automatizacion.model.Product;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.cedaniel200.automatizacion.userinterface.MenuPage.HOME_MENU;
import static com.cedaniel200.automatizacion.userinterface.MenuPage.pag;
import static com.cedaniel200.automatizacion.userinterface.ProductPage.ADD_TO_CART_BUTTON;


public class Add /*implements Task*/ {

    private Product product;

    public Add(Product product) {
        this.product = product;
    }
    public static void Esperar(WebElement driver){
        WebElement espera = new WebDriverWait(pag, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(driver));
    }
    public static WebElement WaitCategory(Product productCategory){
        WebElement productC = pag.findElement(By.linkText("//a[text()='"+productCategory.getCategory()+"']"));
        return productC;
    }
    public static WebElement WaitProductName(Product productName){
        WebElement productN = pag.findElement(By.linkText("//a[text()='"+productName.getName()+"']"));
        return productN;
    }


    /*@Override*/
  //  @Step("{0} add to cart")
   /* public <T extends Actor> void performAs(actor.name) { */
    public static void toCart(Product product) {
        /*WaitUntil.the(HOME_MENU, isClickable()).forNoMoreThan(10).seconds()
          Click.on(HOME_MENU)
          WaitUntil.the(CATEGORY_MENU.of(product.getCategory()), isVisible()).forNoMoreThan(10).seconds(),
          Click.on(CATEGORY_MENU.of(product.getCategory())),
          WaitUntil.the(PRODUCT.of(product.getName()), isVisible()).forNoMoreThan(10).seconds(),
          Click.on(PRODUCT.of(product.getName())),
          Click.on(ADD_TO_CART_BUTTON),
          WaitUntil.the(alertIsPresent()).forNoMoreThan(Duration.ofSeconds(10 ));
          Switch.toAlert()
        */
        Esperar(HOME_MENU);
        HOME_MENU.click();
        Esperar(WaitCategory(product));
        WaitCategory(product).click();
        Esperar(WaitProductName(product));
        WaitProductName(product).click();
        ADD_TO_CART_BUTTON.click();
        WebDriverWait wait=new WebDriverWait(pag,Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.alertIsPresent());
       // new DriverTask(driver -> pag.switchTo().alert());
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }

   /* public static Add toCart(Product product) {
        return instrumented(Add.class, product);
    }*/
}
