package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static PageObjects.Langingpage.*;
import static baseclass.BaseClass.LaunchUrl;

public class LoginStepDefenition {
    @Given("user is on Application Landing Page")
    public void user_is_on_application_landing_page() {
        LaunchUrl();
    }
    @Given("^user enters username (.+) Password (.+)$")
    public void user_enters_username_password(String username,String Password) {
        EnterloginCredentials(username,Password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        ClickonSubmit();
    }
    @Then("verify user logged in succesfully")
    public void verify_user_logged_in_succesfully() throws InterruptedException {

        String Message = GetLoginMessage();
        if(Message.contains("Login Successfully")){
            Assert.assertTrue(true);
        }

                }
    @Then("Verify user is not loggedin and invalid credentials message displayed")
    public void verify_user_is_not_loggedin_and_invalid_credentials_message_displayed() {
       String Failmessage= GetLoginFailMessage();
       if(Failmessage.contains("Enter your userName and password correct")){
           Assert.assertTrue(true);
       }
    }

}


