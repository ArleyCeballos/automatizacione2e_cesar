package com.cedaniel200.automatizacion.task;

import com.cedaniel200.automatizacion.model.ActorS;
import com.cedaniel200.automatizacion.model.Credentials;

import static com.cedaniel200.automatizacion.userinterface.LoginPage.*;
import static com.cedaniel200.automatizacion.userinterface.MenuPage.LOG_IN_MENU;

public class Authenticate /*implements Task*/ {

    private static Credentials credentials;
    public Authenticate(Credentials credentials) {
        this.credentials = credentials;
    }

   //@Override
  //  @Step("{0} performs an authentication")
    public static <T extends ActorS> void autenticate(Credentials actor) {
        /*
        * Click.on(LOG_IN_MENU),
        *Enter.theValue(credentials.getUsername()).into(USERNAME),
        * Enter.theValue(credentials.getPassword()).into(PASSWORD),
        * Click.on(LOG_IN_BUTTON)
        * */
       LOG_IN_MENU.click();
       USERNAME.sendKeys(credentials.getUsername());
       PASSWORD.sendKeys(credentials.getPassword());
       LOG_IN_BUTTON.click();


       // actor.should(seeThat(the(LOG_OUT_MENU.waitingForNoMoreThan(Duration.ofSeconds(10))), isVisible())
          //      .orComplainWith(AuthenticationError.class, MESSAGE_FAILED_AUTHENTICATION));
    }

   /* public static Authenticate authenticate(Credentials credentials){
        return instrumented(Authenticate.class, credentials);
    }
    */

}
