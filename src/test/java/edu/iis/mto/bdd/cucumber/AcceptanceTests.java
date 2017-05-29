package edu.iis.mto.bdd.cucumber;

import org.junit.BeforeClass;

public class AcceptanceTests {

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.gecko.driver", "path\\to\\geckodriver.exe");

    }
}
