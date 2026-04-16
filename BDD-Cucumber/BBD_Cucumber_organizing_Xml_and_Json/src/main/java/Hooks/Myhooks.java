package Hooks;

import io.cucumber.java.*;

public class Myhooks {
@Before
public void beforestep() {
	System.out.println("***Before step***");
}
@After
public void Afterstep() {
	System.out.println("***After step***");
}
}
