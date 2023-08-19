package paralel;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;

public class StepDefs {

    @Given("Step from {string} in {string} feature file")
    public void step(String scenario, String file) {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().threadId(), scenario,file);
    }
}
