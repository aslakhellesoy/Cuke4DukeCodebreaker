package codebreaker;

import cuke4duke.Given;

public class CodeBreakerSteps {
    @Given("the secret code is (.*)")
    public void theSecretCodeIs(String code) {
        game = new Game(code);
    }

}