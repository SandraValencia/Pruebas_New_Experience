package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.CreateAccountUI;


public class CreateQuestion implements Question {
    private final String validtext;

    public CreateQuestion (String validtext) {
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(CreateAccountUI.TEXT_VALIDO).viewedBy(actor).asString().equals(validtext.toString()))
            return true;
        else
            return false;


    }
    public static CreateQuestion loginvalidtext(String validtext){ return new CreateQuestion(validtext);
    }
}
