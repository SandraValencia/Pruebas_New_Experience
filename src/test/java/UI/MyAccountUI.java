package UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountUI {
    public static final Target TEXT_VALID = Target.the("El usuario valida que esta en la pagina de mi cuenta").located(By.xpath("//h1[contains(.,'My account')]"));
}
