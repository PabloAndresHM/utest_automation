package tasks;

import interfaces.FillPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Fill implements Task {
    String  name,last_name,email,city,zip,password;

    public Fill(String name, String last_name, String email,
                String city, String zip, String password) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.zip = zip;
        this.password = password;
    }

    public static Performable theFields(String name, String last_name,
                                        String email, String city, String zip, String password) {
        return Tasks.instrumented(Fill.class,name,last_name,email,city,zip,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(FillPage.NAME),
                Enter.theValue(last_name).into(FillPage.LAST_NAME),
                Enter.theValue(email).into(FillPage.EMAIL),
                Click.on(FillPage.BIRTH_MONTH),
                Click.on(FillPage.BIRTH_DAY),
                Click.on(FillPage.BIRTH_YEAR),
                Click.on(FillPage.NEXT_LOCATION),
                Enter.theValue(city).into(FillPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(FillPage.CITY),
                Hit.the(Keys.ENTER).into(FillPage.CITY),
                Enter.theValue(zip).into(FillPage.ZIP),
                Click.on(FillPage.NEXT_DEVICES),
                Click.on(FillPage.NEXT_LAST),
                Enter.theValue(password).into(FillPage.PASSWORD),
                Enter.theValue(password).into(FillPage.CONFIRM_PASSWORD),
                Click.on(FillPage.STAY_INFORMED),
                Click.on(FillPage.TERMS_OF_USE),
                Click.on(FillPage.PRIVACY)
        );

    }
}
