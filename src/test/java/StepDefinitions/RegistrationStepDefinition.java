package StepDefinitions;

import PageObjects.Langingpage;
import PageObjects.Registrationpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

import static baseclass.BaseClass.*;


public class RegistrationStepDefinition {

public WebDriver driver;

@Before
public void setupbrowser(){
    setup();
}
@After
public void CloseBrowser(){
    teardown();
}
    @Given("user is on Application registration page")
    public void user_is_on_application_registration_page() {
        LaunchUrl();
        Langingpage.launchRegistartionpage();
           }

    @Given("user provides username Password and confirm password")
    public void user_provides_username_password_and_confirmpassword() throws IOException {
        Registrationpage.Enterdetails();

    }
    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        Registrationpage.ClickSubmitBotton();
    }
    @Then("verify if user registered successfully")
    public void user_registered_succesfully() throws IOException {
       String usernamenote = Registrationpage.getConfirmation();
       if(usernamenote.contains("Thank you for registering")){
           Assert.assertTrue(true);
       }

        TakeScreenshot("./target/Screenshots/Registartion.png");

    }

}
