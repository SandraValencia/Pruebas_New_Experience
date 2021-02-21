package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.MyAccountUI;

public class LoginQuestion implements Question {
    private final String validtexto;

    public LoginQuestion(String validtexto) {
        this.validtexto = validtexto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(MyAccountUI.TEXT_VALID).viewedBy(actor).asString().equals(validtexto.toString()))
            return true;
        else
            return false;

    }
    public static LoginQuestion loginvalidtext(String validtexto){
        return new LoginQuestion(validtexto);
    }
}
