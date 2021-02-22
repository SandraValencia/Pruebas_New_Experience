package UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target BUTTON_LOGUIN = Target.the("Boton logueo").located(By.xpath("//a[@class='login']"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Ingresa el email").located(By.id("email"));
    public static final Target INPUT_PASSWORD= Target.the("Ingresa la contrasena").located(By.id("passwd"));
    public static final Target BUTTON_SIGN_IN= Target.the("boton sign in").located(By.id("SubmitLogin"));
}
