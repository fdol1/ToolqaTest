package com.test.stepdefinitions;

import com.test.model.RegistroUsuarioData;
import com.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistrarUsuarioStepDefinition {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ingresa a la pagina de ToolsQa$")
    public void queCristianIngresaALaPaginaDeToolsQa(String actor) {
        theActorCalled(actor).wasAbleTo(AbrirNavegador.enLaPagina());
    }

    @Dado("^que (.*) ingresa al registro de usuario$")
    public void queCristianIngresaAlRegistroDeUsuario(String actor) {
    }

    @Cuando("^ingresa los datos de registro$")
    public void ingresaLosDatosDeRegistro(List<RegistroUsuarioData> demoblazeData) {
    }

    @Entonces("^se muestra el mensaje Sign up successful$")
    public void seMuestraElMensajeSignUpSuccessful() {
    }


}
