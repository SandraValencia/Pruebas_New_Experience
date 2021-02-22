package stepdefinition;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.LoginQuestion;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {
    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario abre la aplicacion$")
    public void el_usuario_abre_la_aplicacion() throws Throwable {
        theActorCalled("usuario").attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^el usuario ingresa (.+) y (.+)$")
    public void el_usuario_ingresa_y(String email, String contrasena) {
        theActorCalled("usuario").attemptsTo(LoginTask.inicioSesion(email, contrasena));
    }

    @Then("^el usuario debe ver su cuenta (.+)$")
    public void el_usuario_debe_ver_su_cuenta(String validtexto) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.loginvalidtext(validtexto)));
    }

}
