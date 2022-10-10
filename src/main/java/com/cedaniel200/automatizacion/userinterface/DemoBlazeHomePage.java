package com.cedaniel200.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cedaniel200.automatizacion.userinterface.MenuPage.pag;

public class DemoBlazeHomePage {
    public static String category;
    public static String product;
    private DemoBlazeHomePage() {
    }
    /*
    public static final Target BANNER = Target.the("homepage banner").located(By.id("narvbarx"));
    public static final Target CATEGORY_MENU = Target.the("Category of {0}").locatedBy("//a[@id='itemc'][text()='{0}']");
      public static final WebElement PRODUCT = Target.the("Product {0}").locatedBy("//div[contains(@class,'card')]//a[text()='{0}']");
    */

    public static final WebElement BANNER = pag.findElement(By.id("narvbarx"));
    public static final WebElement CATEGORY_MENU = pag.findElement
            (By.xpath("//a[@id='itemc'][text()='"+category+"']"));
    public static final WebElement PRODUCT = pag.findElement
            (By.xpath("//div[contains(@class,'card')]//a[text()='"+product+"']"));
}
