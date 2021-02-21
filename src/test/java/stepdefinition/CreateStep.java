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
import task.CreateTask;
import task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateStep {
    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^El usuario ingresa a la aplicacion$")
    public void el_usuario_ingresa_a_la_aplicacion(){
        theActorCalled("usuario").attemptsTo(Open.url("http://automationpractice.com/index.php"));
    }

    @When("^ El usuario ingresa (.+)$")
    public void el_usuario_ingresa(String email, String nombre, String apellido,String contrasena, String nombre_1, String apellido_1, String compania, String direccion, String direccion_1, String ciudad, String codigo_postal, String informacion, String telefono, String celular, String asignar_direccion) {
        theActorCalled("usuario").attemptsTo(CreateTask.crearcuenta(email,nombre,apellido,contrasena, nombre_1,apellido_1,compania,direccion,direccion_1,ciudad,codigo_postal,informacion,telefono,celular,asignar_direccion));
    }

    @Then("^ El usuario debe ver formulario para ingresar sus datos(.+)$")
    public void el_usuario_debe_ver_formulario_para_ingresar_sus_datos(String validtext)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreateQuestion.loginvalidtext(validtext)));
    }

}
