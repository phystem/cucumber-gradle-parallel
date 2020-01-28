package example;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PalindromeSteps implements En {
    String nameToCheck;

    public PalindromeSteps() {

        Given("I have a name {string}", (String name) -> {
            this.nameToCheck = name;
        });

        Then("the name should be a palindrome", () -> {
            String reversedString = new StringBuilder(nameToCheck).reverse().toString();
            Assert.assertEquals(nameToCheck, reversedString);
        });
    }
}
