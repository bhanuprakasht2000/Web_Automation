package Hooks;

import io.cucumber.java.*;

public class Myhooks {
@Before
public void beforestep(Scenario scenario) {
	System.out.println("***Before step*** "+scenario.getName());
}
@After
public void Afterstep(Scenario scenario) {
	System.out.println("***After step*** "+scenario.getName());
}
}
