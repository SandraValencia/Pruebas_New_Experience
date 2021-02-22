package question;

import UI.MyAccountUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class CreateQuestion implements Question {
    private final String validtext;

    public CreateQuestion (String validtext) {
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(MyAccountUI.TEXT_VALID).viewedBy(actor).asString().equals(validtext.toString()))
            return true;
        else
            return false;


    }
    public static CreateQuestion loginvalidtext(String validtext){ return new CreateQuestion(validtext);
    }
}
