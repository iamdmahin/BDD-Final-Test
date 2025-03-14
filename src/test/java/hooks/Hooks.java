package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup() {
        AqualityServices.getBrowser().maximize();
    }

    @After
    public void teardown() {
        AqualityServices.getBrowser().quit();
    }
}