package codebreaker;

import cuke4duke.*;
import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class CodeBreakerSteps {
    private Game game;
    private String mark;
    
    @Given("the secret code is (.*)")
    public void theSecretCodeIs(String code) {
        game = new Game(stripSpace(code));
    }

    @When("I guess (.*)")
    public void iGuess(String code) {
        mark = game.guess(stripSpace(code));
    }

    @Then("the mark should be (.*)")
    public void theMarkShouldBe(String code) {
        assertEquals(code, mark);
    }

    private String stripSpace(String s) {
       return s.replaceAll(" ", "");        
    }
}