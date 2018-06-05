package edu.iis.mto.bdd.cucumber.steps;

import static edu.iis.mto.bdd.model.FrequentFlyerMember.Jane;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import edu.iis.mto.bdd.model.FrequentFlyerMember;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserAuthenticationSteps {

    private WebDriver driver;
    private static String port = System.getProperty("port");
    private FrequentFlyerMember user;
    @Before
    public void init() {
        driver = new FirefoxDriver();
        user= Jane;
    }

    @Given("^(.*) is a registered Frequent Flyer$")
    public void givenARegisteredFrequentFlyer(String userEmail) {}

    @When("^(.*) authenticates with a valid email address and password$")
    public void whenJaneAuthenticatesWithAValidEmailAddressAndPassword(String user) {
        driver.get("http://localhost:"+port+"#/welcome");
        driver.findElement(By.name("email")).sendKeys("janina.kowalska@acme.com");
        driver.findElement(By.name("password")).sendKeys("s3cr3t");
        driver.findElement(By.name("signin")).click();
    }

    @Then("^(.*) should be given access to (?:her|his) account$")
    public void thenTheUserShouldBeGivenAccessToAccount(String userName) {
        driver.get("http://localhost:"+port+"#/home");
        assertThat(driver.findElement(By.id("welcome-message")).getText(), equalTo("Witaj Janina"));
    }

    @Given("^(.*) has logged on$")
    public void aUserHasLoggedOnAs(String user) {
        driver.get("http://localhost:"+port+"#/welcome");
        driver.findElement(By.name("email")).sendKeys("janina.kowalska@acme.com");
        driver.findElement(By.name("password")).sendKeys("s3cr3t");
        driver.findElement(By.name("signin")).click();
    }

    @When("^(?:.*) views the home page$")
    public void whenAUserViewsTheHomePage() {}

    @After
    public void close() {
        driver.close();
    }

}
