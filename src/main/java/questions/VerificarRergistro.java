
/*

 Pendiente de correccion de error, para terminar de implementar este metodo.

package questions;

import model.DataRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.RegistroUsuario;

public class VerificarRergistro implements Question<Boolean> {

    private DataRegistro dataRegistro;

    public VerificarRergistro(DataRegistro dataRegistro) {this.dataRegistro = dataRegistro;}

    public static VerificarRergistro texto(DataRegistro dataRegistro) {
        return new VerificarRergistro(dataRegistro);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado ;

        String verificarTexto = Text.of(RegistroUsuario.TEXTO).viewedBy(actor).asString();
        if (dataRegistro.equals(verificarTexto)){
            resultado = true;
        }else {
            resultado = false;
        }
        return null;
    }
}*/
