package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.SearchQuestion;
import task.SearchTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStep {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario entra a la aplicacion$")
    public void el_usuario_entra_a_la_aplicacion() {
        theActorCalled("usuario").attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^el usuario ingresa (.+) a buscar$")
    public void el_usuario_ingresa_a_buscar(String producto) {
        theActorCalled("usuario").attemptsTo(SearchTask.buscar(producto));
    }

    @Then("^el usuario debe ver opciones de producto buscado (.+)$")
    public void el_usuario_debe_ver_opciones_de_producto_buscado(String validproducto) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchQuestion.loginvalidtext(validproducto)));
    }
}
