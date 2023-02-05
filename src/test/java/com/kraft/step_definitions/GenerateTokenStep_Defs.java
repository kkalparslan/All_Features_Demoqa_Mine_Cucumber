package com.kraft.step_definitions;

import com.kraft.services.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GenerateTokenStep_Defs {
    Register register=new Register();
    @Given("Input valid credentials")
    public void inputValidCredentials() {
        register.generateToken();

    }
    @Then("verify token Status Code")
    public void verifyTokenStatusCode() {
        register.verifyToken();
    }
}
