package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import marsrover.Rover;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class RoverStepDef {

    Rover rover  ;
    @Given("the plateau size is 5x5")
    public void the_plateau_size_is_5x5() {
        rover = new Rover();
    }
    @When("a rover is positioned at Coordinates {int} , {int}  facing North as {int}")
    public void aRoverIsPositionedAtCoordinatesFacingNorthAs(int arg0, int arg1, int arg2) {
        rover.setPosition(arg0, arg1, arg2);
    }

    @Then("the rover's position should be {int} , {int} facing North as {int}")
    public void theRoverSPositionShouldBeFacingNorthAs(int arg0, int arg1, int arg2) {
        assertEquals(arg0, (long) rover.getX());
        assertEquals(arg1, (long) rover.getY());
        assertEquals(arg2, (long) rover.getFacing());
    }

    @Then("the rover's position should be {int} , {int} facing East as {int}")
    public void theRoverSPositionShouldBeFacingEastAs(int arg0, int arg1, int arg2) {
        assertEquals(arg0, (long) rover.getX());
        assertEquals(arg1, (long) rover.getY());
        assertEquals(arg2, (long) rover.getFacing());
    }


    @Given("a rover is positioned at Coordinates {int} , {int} facing East as {int}")
    public void a_rover_is_positioned_at_coordinates_facing_east_as(Integer int1, Integer int2, Integer int3) {
        rover.setPosition(int1, int2, int3);
    }

    @When("the rover recieves the command {string}")
    public void the_rover_recieves_the_command(String string) {
        rover.process(string);
    }


}
