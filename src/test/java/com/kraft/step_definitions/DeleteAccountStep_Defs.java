package com.kraft.step_definitions;

import com.kraft.services.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteAccountStep_Defs {
    Register register=new Register();
    @Given("User should delete account")
    public void user_should_delete_account() {
        register.deleteAccount();
    }
    @Then("User should verify delete account status code")
    public void user_should_verify_delete_account_status_code() {
        register.verifyDeleteAccount();
    }
}
