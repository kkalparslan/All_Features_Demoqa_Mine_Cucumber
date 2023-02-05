package com.kraft.step_definitions;

import com.kraft.services.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AllBooksStep_Defs {
    Register register=new Register();
    @Given("User should see book list")
    public void user_should_see_book_list() {
        register.allBooks();
    }
    @Then("User verify the books status codes")
    public void user_verify_the_books_status_codes() {
        register.verifyAllBooks();
    }

}
