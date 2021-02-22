package task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import UI.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String email;
    private final String contrasena;

    public LoginTask(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginUI.BUTTON_LOGUIN));
        actor.attemptsTo(Enter.theValue(email).into(LoginUI.INPUT_EMAIL_ADDRESS));
        actor.attemptsTo(Enter.theValue(contrasena).into(LoginUI.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(LoginUI.BUTTON_SIGN_IN));
    }
    public static Performable inicioSesion(String email,String contrasena){
        return instrumented(LoginTask.class,email,contrasena);
}
}
