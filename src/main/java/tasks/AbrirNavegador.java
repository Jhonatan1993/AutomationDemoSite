package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirPaginaDemoSite;

public class AbrirNavegador implements Task {

    private AbrirPaginaDemoSite abrirPaginaDemoSite;

    public static AbrirNavegador pagina() {return Tasks.instrumented(AbrirNavegador.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaDemoSite));
    }
}
