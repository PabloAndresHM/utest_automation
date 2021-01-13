package interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject {
    public static final Target JOIN_TODAY= Target.the("Button to create a new account").located(
            By.className("unauthenticated-nav-bar__sign-up"));
}
