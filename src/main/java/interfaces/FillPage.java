package interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {
    public static final Target NAME= Target.the("field to write the name").located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("field to write the last name").located(By.id("lastName"));
    public static final Target EMAIL= Target.the("field to write the EMAIL").located(By.id("email"));
    public static final Target BIRTH_DAY= Target.the("select the day of birth").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[18]"));
    public static final Target BIRTH_MONTH= Target.the("select the month of birth").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[6]"));
    public static final Target BIRTH_YEAR= Target.the("select the year of birth").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[13]"));
    public static final Target NEXT_LOCATION= Target.the("button to go to next step").located(By.className("btn-blue"));
    public static final Target CITY= Target.the("select the the city").located(By.id("city"));
    public static final Target ZIP= Target.the("field to write the zipcode").located(By.id("zip"));
    public static final Target NEXT_DEVICES= Target.the("button to go to next step devices").located(By.className("btn-blue"));
    public static final Target NEXT_LAST= Target.the("button to go to next step last ").located(By.className("btn-blue"));

    public static final Target PASSWORD= Target.the("field to write the password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD= Target.the("field to write the password again").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED= Target.the("check stay informed").located(By.className("signup-consent__text--highlight"));
    public static final Target TERMS_OF_USE= Target.the("check  terms").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY= Target.the("check  PRIVACY").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target TEXT_TO_CONFIRM= Target.the("CONFIRM TEXT").located(By.className("sub-title"));



}
