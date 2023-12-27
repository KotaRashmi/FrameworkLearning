package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

import static PageObjects.Filighbookingpage.*;

public class Flightbookingstepdef {
    @Given("user navigates to flight finderpage")
    public void user_navigates_to_flight_finderpage() {

        LaunchFlightfinderpage();
    }
    @When("user chooses  passengers count")
    public void user_chooses_passengers() throws IOException {
    SelectNumberofPassengers();
    }
    @When("user selects From port")
    public void user_selects_from_port() throws IOException {
        SelectFromlocation();
    }
    @When("user Selects on Month and Day")
    public void user_selects_on_month_and_day() throws IOException {
        SelecteToDate();
    }
    @When("user selects To port")
    public void user_selects_to_port() throws IOException {
        SelectReturnlocation();
    }
    @When("user Selects Returing Month and Day")
    public void user_selects_returing_month_and_day() throws IOException {
        SelecteReturnDate();
    }
    @When("user selects Biussness class and Airline")
    public void user_selects_biussness_class_and_airline() throws IOException {
        SelectAirlineClassPreference();
        TakeScreenshot("./target/Screenshots/FilightFinder.png");
    }
    @When("user clicks on Continue Button")
    public void user_clicks_on_continue_button() {
       continueBooking();
    }
    @Then("Verify if the Flight is booked succesfully")
   public void verify_if_the_flight_is_booked_succesfully() throws IOException {
      String SeatsAvl =  SelectFlight();
      if(SeatsAvl.contains("No Seats Avaialble")){
          Assert.assertTrue(true);
          System.out.println("booked");
      }
        else {
            Assert.assertTrue(false);
      }
        TakeScreenshot("./target/Screenshots/AfterFlightFinder.png");
    }
}
