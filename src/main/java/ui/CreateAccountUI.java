package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountUI {
    public static final Target TEXT_VALIDO = Target.the("El usuario valida que esta en la pagina para ingresar la informacion").located(By.xpath("//h1[contains(.,'Create an account')]"));
}
