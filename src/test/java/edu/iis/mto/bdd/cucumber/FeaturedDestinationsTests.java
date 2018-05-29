package edu.iis.mto.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, tags = {"@feat-destinations"},
        glue = "edu.iis.mto.bdd.cucumber.steps")
public class FeaturedDestinationsTests extends AcceptanceTests {

}
