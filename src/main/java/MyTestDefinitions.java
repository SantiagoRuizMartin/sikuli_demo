import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import robot_demo.Demo;

public class MyTestDefinitions {

    private Demo demo;

    public MyTestDefinitions(Demo demo) {
        this.demo = demo;
    }

    @Given("I have postman open")
    public void iHavePostmanOpen() {
        demo.startPostman();
    }

    @And("I go to the consumers tab")
    public void iGoToTheConsumersTab() {
        demo.goToConsumerTab();
    }

    @When("I press the send button")
    public void iPressTheSendButton() {
        demo.pressSendButton();
    }

    @Then("The authorization field should be marked")
    public void theAuthorizationFieldShouldBeMarked() {
        demo.ValidateResuts();
    }
}
