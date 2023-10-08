import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CalculatorStepDefinitions{
    private int numberOne;
    private int numberTwo;
    private String operation;
    private double result;

    @Given("two integer numbers, (\\d+) e (\\d+)$")
    public void two_integer_numbers(int number1 , int number2){
        numberOne = number1;
        numberTwo = number2;
    }

    @And("an operation , (.+)$")
    public void a_operation(String operationTest){
        operation = operationTest;

    }
    @When("I calculate$")
    public void i_calculate(){
        result = Calculator.calculate(numberOne , numberTwo , operation);
    }

    @Then("the result should be (\\d+\\.?\\d*)$")
    public void the_result_should_be(double result){
        Assert.assertEquals(result, result, 0.01); // Use a small margin of error (0.01) when dealing with decimal numbers

    }
}
