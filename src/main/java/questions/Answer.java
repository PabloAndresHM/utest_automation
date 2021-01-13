package questions;

import interfaces.FillPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Object toThe(String question) {
        return new Answer(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result=Boolean.FALSE;
        String message= Text.of(FillPage.TEXT_TO_CONFIRM).viewedBy(actor).asString();
        result=(message.contains(question))?Boolean.TRUE:Boolean.FALSE;
        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
