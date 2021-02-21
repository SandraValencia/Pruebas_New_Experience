package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchUI {
    public static final Target INPUT_SEARCH = Target.the("Ingresa el producto").located(By.id("search_query_top"));
    public static final Target BUTTON_SEARCH = Target.the(" Clic boton buscar").located(By.xpath("//button[@name='submit_search']"));
}

