package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUI {
    public static final Target BUTTON_LOGUIN = Target.the("Boton logueo").located(By.xpath("//a[@class='login']"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Ingresa email").located(By.id("email_create"));
    public static final Target BUTTON_CREATE= Target.the("Boton crear cuenta").located(By.id("SubmitCreate"));
    public static final Target CHECKBOX = Target.the("Selecciona opcion").located(By.id("id_gender1"));
    public static final Target INPUT_NOMBRE = Target.the("Ingresa nombre").located(By.id("customer_firstname"));
    public static final Target INPUT_APELLIDO = Target.the("Ingresa apellido").located(By.id("customer_lastname"));
    public static final Target INPUT_CONTRASENA= Target.the("Ingresa contrasena").located(By.id("passwd"));
    public static final Target SELECT_DATE_BIRTH = Target.the("Escoge el dia").located(By.cssSelector("select#days"));
    public static final Target SELECT_MONTH_BIRTH = Target.the("Escoge el mes").located(By.cssSelector("select#months"));
    public static final Target SELECT_YEAR_BIRTH = Target.the("Escoge el ano").located(By.cssSelector("select#years"));
    public static final Target INPUT_NOMBRE_1 = Target.the("Ingresa nombre").located(By.id("firstname"));
    public static final Target INPUT_APELLIDO_1 = Target.the("Ingresa apellido").located(By.id("lastname"));
    public static final Target INPUT_COMPANIA = Target.the("Ingresa compania").located(By.id("company"));
    public static final Target INPUT_DIRECCION = Target.the("Ingresa direccion").located(By.id("address1"));
    public static final Target INPUT_DIRECCION_1= Target.the("Ingresa direccion").located(By.id("address2"));
    public static final Target INPUT_CUIDAD = Target.the("Ingresa ciudad").located(By.id("city"));
    public static final Target SELECT_STATE= Target.the("Selecciona Estado").located(By.cssSelector("select#id_state"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Ingresa codigo postal").located(By.id("postcode"));
    public static final Target SELECT_COUNTRY = Target.the("selecciona el pais").located(By.cssSelector("select#id_country"));
    public static final Target INPUT_INFORMACION = Target.the("Ingresa informacion adicional").located(By.id("other"));
    public static final Target INPUT_TELEFONO = Target.the("Ingresa telefono").located(By.id("phone"));
    public static final Target INPUT_CELULAR = Target.the("Ingresa celular").located(By.id("phone_mobile"));
    public static final Target INPUT_ASIGNAR_DIRECCION = Target.the("Ingresa direccion alias").located(By.id("alias"));
    public static final Target BUTTON_REGISTER = Target.the("Boton Registrar").located(By.id("submitAccount"));

}
