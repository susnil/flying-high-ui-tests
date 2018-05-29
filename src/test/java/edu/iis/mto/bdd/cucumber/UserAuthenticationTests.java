package edu.iis.mto.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, tags = {"@authentication"},
        glue = "edu.iis.mto.bdd.cucumber.steps")
public class UserAuthenticationTests extends AcceptanceTests {

}
