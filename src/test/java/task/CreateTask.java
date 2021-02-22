package task;

import UI.CreateUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateTask implements Task{
    private final String email;
    private final String nombre;
    private final String apellido;
    private final String contrasena;
    private final String nombre_1;
    private final String apellido_1;
    private final String compania;
    private final String direccion;
    private final String direccion_1;
    private final String ciudad;
    private final String codigo_postal;
    private final String informacion;
    private final String telefono;
    private final String celular;
    private final String asignar_direccion;


    public CreateTask(String email, String nombre, String apellido, String contrasena, String nombre_1, String apellido_1, String compania, String direccion, String direccion_1, String ciudad, String codigo_postal, String informacion, String telefono, String celular, String asignar_direccion){
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.nombre_1 = nombre_1;
        this.apellido_1 = apellido_1;
        this.compania = compania;
        this.direccion = direccion;
        this.direccion_1 = direccion_1;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
        this.informacion = informacion;
        this.telefono = telefono;
        this.celular = celular;
        this.asignar_direccion = asignar_direccion;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreateUI.BUTTON_LOGUIN));
        actor.attemptsTo(Enter.theValue(email).into(CreateUI.INPUT_EMAIL_ADDRESS));
        actor.attemptsTo(Click.on(CreateUI.BUTTON_CREATE));
        actor.attemptsTo(Click.on(CreateUI.CHECKBOX));
        actor.attemptsTo(Enter.theValue(nombre).into(CreateUI.INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue(apellido).into(CreateUI.INPUT_APELLIDO));
        actor.attemptsTo(Enter.theValue(contrasena).into(CreateUI.INPUT_CONTRASENA));
        actor.attemptsTo(SelectFromOptions.byIndex(2).from(CreateUI.SELECT_DATE_BIRTH));
        actor.attemptsTo(SelectFromOptions.byIndex(4).from(CreateUI.SELECT_MONTH_BIRTH));
        actor.attemptsTo(SelectFromOptions.byIndex(20).from(CreateUI.SELECT_YEAR_BIRTH));
        actor.attemptsTo(Enter.theValue(nombre_1).into(CreateUI.INPUT_NOMBRE_1));
        actor.attemptsTo(Enter.theValue(apellido_1).into(CreateUI.INPUT_APELLIDO_1));
        actor.attemptsTo(Enter.theValue(compania).into(CreateUI.INPUT_COMPANIA));
        actor.attemptsTo(Enter.theValue(direccion).into(CreateUI.INPUT_DIRECCION));
        actor.attemptsTo(Enter.theValue(direccion_1).into(CreateUI.INPUT_DIRECCION_1));
        actor.attemptsTo(Enter.theValue(ciudad).into(CreateUI.INPUT_CUIDAD));
        actor.attemptsTo(SelectFromOptions.byIndex(11).from(CreateUI.SELECT_STATE));
        actor.attemptsTo(Enter.theValue(codigo_postal).into(CreateUI.INPUT_CODIGO_POSTAL));
        actor.attemptsTo(SelectFromOptions.byIndex(1).from(CreateUI.SELECT_COUNTRY));
        actor.attemptsTo(Enter.theValue(informacion).into(CreateUI.INPUT_INFORMACION));
        actor.attemptsTo(Enter.theValue(telefono).into(CreateUI.INPUT_TELEFONO));
        actor.attemptsTo(Enter.theValue(celular).into(CreateUI.INPUT_CELULAR));
        actor.attemptsTo(Enter.theValue(asignar_direccion).into(CreateUI.INPUT_ASIGNAR_DIRECCION));
        actor.attemptsTo(Click.on(CreateUI.BUTTON_REGISTER));
    }
    public static Performable crearcuenta(String email, String nombre, String apellido, String contrasena, String nombre_1, String apellido_1, String compania, String direccion, String direccion_1, String ciudad, String codigo_postal, String informacion, String telefono, String celular, String asignar_direccion){
        return instrumented(CreateTask.class,email,nombre,apellido,contrasena,nombre_1,apellido_1,compania,direccion,direccion_1,ciudad,codigo_postal,informacion,telefono,celular,asignar_direccion);
    }


}
