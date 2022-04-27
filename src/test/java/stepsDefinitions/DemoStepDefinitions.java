package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataRegistro;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirNavegador;
import tasks.RegistroDemoSite;
import java.util.List;

public class DemoStepDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Carlos quiere acceder a la Web Automation Demo Site$")
    public void queCarlosQuiereAccederALaWebAutomationDemoSite() {
        OnStage.theActorCalled("Carlos").wasAbleTo(AbrirNavegador.pagina());
    }

    @When("^el realiza el registro en la pagina$")
    public void elRealizaElRegistroEnLaPagina(List<DataRegistro> dataRegistro) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroDemoSite.formulario((dataRegistro.get(0))));
    }

    @Then("^el verifica que se carga la pantalla con texto$")
    public void elVerificaQueSeCargaLaPantallaConTexto(List<DataRegistro> dataRegistro) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarRergistro.texto(dataRegistro.get(0))));
    }
}
