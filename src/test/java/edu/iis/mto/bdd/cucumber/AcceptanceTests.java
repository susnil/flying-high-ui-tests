package edu.iis.mto.bdd.cucumber;

import org.junit.BeforeClass;

public class AcceptanceTests {

    private static final String GECKODRIVER_NAME = "geckodriver.exe";
    private static final String GECKO_PATH = "C:\\Users\\Student\\Downloads\\geckodriver-v0.20.1-win64\\";
    private static final String PORT = "8000/app/index.html";

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.gecko.driver", GECKO_PATH + GECKODRIVER_NAME);
        System.setProperty("port", PORT);

    }
}
