package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuario extends PageObject {

    public static final Target FIRTS_NAME = Target.the("Ingreasr primer nombre").located(By.xpath("//input[contains(@placeholder,'First Name')]"));
    public static final Target LAST_NAME = Target.the("Ingresar Apellido").located(By.xpath("//input[contains(@placeholder,'Last Name')]"));
    public static final Target ADDRESS = Target.the("Ingresar la direccion").located(By.xpath("//textarea[contains(@ng-model,'Adress')]"));
    public static final Target EMAIL_ADDRESS = Target.the("Ingresar direccion de email").located(By.xpath("//input[contains(@ng-model,'EmailAdress')]"));
    public static final Target PHONE = Target.the("Ingresar numero de celular").located(By.xpath("//input[contains(@ng-model,'Phone')]"));
    public static final Target GENDER = Target.the("Seleccionar genero").located(By.xpath("//input[contains(@value,'Male')]"));
    public static final Target HOBBIES = Target.the("Seleccionar hobbies").located(By.id("checkbox2"));
    public static final Target LANGUAGES_CLICK = Target.the("Dar click al campo languages").located(By.id("msdd"));
    public static final Target LANGUAGES = Target.the("Seleccionar idionma").located(By.xpath("//li//a[contains(text(),'Spanish')]"));
    public static final Target SKILLS = Target.the("Seleccionar skills").located(By.id("Skills"));
    public static final Target SELECT_COUNTRY = Target.the("Seleccionar pais").located(By.xpath("//span[@class='selection']"));
    public static final Target INPUT_COUNTRY = Target.the("Ingresar pais").located(By.xpath("//input[@class='select2-search__field']"));
    public static final Target YEAR = Target.the("Seleccionar año de nacimiento").located(By.id("yearbox"));
    public static final Target MONTH = Target.the("Seleccionar mes de nacimiento").located(By.xpath("//select[@placeholder='Month']"));
    public static final Target DAY = Target.the("Seleccionar dia de nacimiento").located(By.id("daybox"));
    public static final Target PASSWORD = Target.the("Ingresar el password").located(By.id("firstpassword"));
    public static final Target CONFIRM_PASSWORD =  Target.the("Ingresar la confirmacion del password").located(By.id("secondpassword"));
    public static final Target BUTTON = Target.the("Boton enviar registro").located(By.id("submitbtn"));

}
