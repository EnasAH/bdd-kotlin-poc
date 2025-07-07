package example

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then
import kotlin.test.assertEquals

class StepDefs {
    private var name: String = ""
    private var message: String = ""

    @Given("the user name is {string}")
    fun the_user_name_is(inputName: String) {
        name = inputName
    }

    @When("I say hello")
    fun i_say_hello() {
        message = sayHello(name)
    }

    @Then("I should see {string}")
    fun i_should_see(expected: String) {
        assertEquals(expected, message)
    }
}
