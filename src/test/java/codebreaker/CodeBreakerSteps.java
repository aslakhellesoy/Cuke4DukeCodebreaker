package codebreaker;

import cuke4duke.Given;

public class CodeBreakerSteps {
    private Game game;
    
    @Given("the secret code is (.*)")
    public void theSecretCodeIs(String code) {
        game = new Game(code);
    }

}