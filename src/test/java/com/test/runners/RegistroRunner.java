package com.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registroUsuario.feature",
        //tags = "@RutaCritica",
        glue = {"com.test.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class RegistroRunner {
}
