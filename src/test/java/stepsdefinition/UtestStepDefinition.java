package stepsdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataFeature;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Answer;
import tasks.Fill;
import tasks.OpenUp;

import java.util.List;

public class UtestStepDefinition {

    @Given("^that (.*) in the homepage go to Join Today$")
    public void thatTheUserInTheHomepageGoToJoinToday(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());

    }

    @When("^the user fill all the fields$")
    public void theUserFillAllTheFields(List<DataFeature> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theFields(
                data.get(0).getName(),
                data.get(0).getLast_name(),
                data.get(0).getEmail(),
                data.get(0).getCity(),
                data.get(0).getZip(),
                data.get(0).getPassword()
        ));

    }

    @Then("^the account is create successful$")
    public void theAccountIsCreateSuccessful(List<DataFeature> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Question<Boolean>) Answer.toThe(
                data.get(0).getText_successfull())));

    }



}
