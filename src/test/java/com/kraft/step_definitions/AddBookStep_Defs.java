package com.kraft.step_definitions;

import com.kraft.services.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddBookStep_Defs {
    Register register=new Register();
    @Given("User should add new book")
    public void user_should_add_new_book() {
        register.addNewBook();
    }
    @Then("User should verify the add book status code")
    public void user_should_verify_the_add_book_status_code() {
        register.verifyNewBook();
    }

}
