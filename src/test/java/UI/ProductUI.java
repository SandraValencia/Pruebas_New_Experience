package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductUI {
    public static final Target TEXT_PRODUCTO = Target.the("El usuario valida el producto buscado").located(By.className("lighter"));
}
