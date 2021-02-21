package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.CreateQuestion;
import question.LoginQuestion;
import question.SearchQuestion;
import task.CreateTask;
import task.LoginTask;
import task.SearchTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStep {
    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^El usuario entra a la aplicacion$")
    public void el_usuario_entra_a_la_aplicacion() {
        theActorCalled("usuario").attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^ El usuario ingresa (.+) a buscar$")
    public void el_usuario_ingresa_a_buscar(String producto) {
        theActorCalled("usuario").attemptsTo(SearchTask.buscarproducto(producto));
    }

    @Then("^ El usuario debe ver opciones del producto buscado (.+)$")
    public void el_usuario_debe_ver_opciones_del_producto_buscado(String validproducto)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchQuestion.loginvalidtext(validproducto)));
    }
}
