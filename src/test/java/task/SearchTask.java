package task;

import UI.SearchUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTask implements Task {
    private final String producto;

    public SearchTask(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(producto).into(SearchUI.INPUT_SEARCH));
        actor.attemptsTo(Click.on(SearchUI.BUTTON_SEARCH));
    }
    public static Performable buscar (String producto){
        return instrumented(SearchTask.class,producto);
    }
}
