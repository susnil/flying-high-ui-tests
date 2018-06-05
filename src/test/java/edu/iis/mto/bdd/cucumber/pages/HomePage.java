package edu.iis.mto.bdd.cucumber.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

        private WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public String getWelcomeMessage() {
            return driver.findElement(By.id("welcome-message")).getText();
        }
}
