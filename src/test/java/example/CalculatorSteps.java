package example;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CalculatorSteps implements En {

    int num1;

    int num2;

    int result;

    public CalculatorSteps() {
        Given("I have numbers {int} and {int}", (Integer number1, Integer number2) -> {
            this.num1 = number1;
            this.num2 = number2;
            //Just to demonstrate parallel execution
            Thread.sleep(2000);
        });
        When("I {string} the numbers", (String operation) -> {
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                default:
                    throw new RuntimeException("Operation - " + operation + " not implemented");
            }
        });
        Then("the output should be {int}", (Integer expectedResult) -> {
            Assert.assertEquals(expectedResult.intValue(), result);
        });
    }
}
