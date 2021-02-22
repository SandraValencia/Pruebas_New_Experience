package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.ProductUI;

public class SearchQuestion implements Question{
    private final String validproducto;

    public SearchQuestion(String validproducto) { this.validproducto = validproducto;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(ProductUI.TEXT_PRODUCTO).viewedBy(actor).asString().equals(validproducto.toString()))
            return true;
        else
            return false;
    }
    public static SearchQuestion loginvalidtext(String validproducto){
        return new SearchQuestion(validproducto);
    }
}
