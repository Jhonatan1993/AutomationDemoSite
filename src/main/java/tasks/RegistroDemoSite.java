package tasks;

import model.DataRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import static userinterface.RegistroUsuario.*;

public class RegistroDemoSite implements Task {
    private DataRegistro dataRegistro;

    public RegistroDemoSite(DataRegistro dataRegistro){
       this.dataRegistro = dataRegistro;
   }

    public static Performable formulario(DataRegistro dataRegistro) {
        return Tasks.instrumented(RegistroDemoSite.class, dataRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Enter.theValue(dataRegistro.getFirt_name()).into(FIRTS_NAME),
               Enter.theValue(dataRegistro.getLast_name()).into(LAST_NAME),
               Enter.theValue(dataRegistro.getAddress()).into(ADDRESS),
               Enter.theValue(dataRegistro.getEmail_address()).into(EMAIL_ADDRESS),
               Enter.theValue(dataRegistro.getPhone()).into(PHONE),
               Click.on(GENDER),
               Click.on(HOBBIES),
               Click.on(LANGUAGES_CLICK),
               Click.on(LANGUAGES),
               SelectFromOptions.byVisibleText(dataRegistro.getSkills()).from(SKILLS),
               Click.on(SELECT_COUNTRY),
               Enter.theValue(dataRegistro.getCountry()).into(INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
               SelectFromOptions.byVisibleText(dataRegistro.getYear()).from(YEAR),
               SelectFromOptions.byVisibleText(dataRegistro.getMonth()).from(MONTH),
               SelectFromOptions.byVisibleText(dataRegistro.getDay()).from(DAY),
               Enter.theValue(dataRegistro.getPassword()).into(PASSWORD),
               Enter.theValue(dataRegistro.getConfirm_password()).into(CONFIRM_PASSWORD),
               Click.on(BUTTON));
    }
}
