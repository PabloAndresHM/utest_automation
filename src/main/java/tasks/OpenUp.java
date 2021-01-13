package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import interfaces.HomePage;

public class OpenUp implements Task {
    HomePage homePage;

    public static Performable thePage() {

        return Tasks.instrumented(OpenUp.class,new Object[0]);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(this.homePage),
                Click.on(HomePage.JOIN_TODAY)

        );

    }
}
