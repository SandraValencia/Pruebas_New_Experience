package stepdefinition;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.CreateQuestion;
import task.CreateTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateStep {
    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario ingresa a la aplicacion$")
    public void el_usuario_ingresa_a_la_aplicacion() {
        theActorCalled("usuario").attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^el usuario debe ingresar (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+)$")
    public void el_usuario_debe_ingresar(String email, String nombre, String apellido, String contrasena, String nombre1, String apellido1, String compania, String direccion, String direccion1, String ciudad, String codigopostal, String informacion, String telefono, String celular, String asignardireccion) {
        theActorCalled("usuario").attemptsTo(CreateTask.crearcuenta(email,nombre,apellido,contrasena, nombre1,apellido1,compania,direccion,direccion1,ciudad,codigopostal,informacion,telefono,celular,asignardireccion));
    }

    @Then("^el usuario debe ver el formulario para ingresar sus datos (.+)$")
    public void el_usuario_debe_ver_el_formulario_para_ingresar_sus_datos(String validtext) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreateQuestion.loginvalidtext(validtext)));
    }

}
