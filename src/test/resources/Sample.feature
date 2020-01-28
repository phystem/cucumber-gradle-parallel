Feature: To Demonstrate Parallel Execution in Cucumber

  Scenario Outline: Just a sample calculation
    Given I have numbers <num1> and <num2>
    When I "<operation>" the numbers
    Then the output should be <result>
    Examples:
      | num1 | num2 | operation | result |
      | 5    | 7    | add       | 12     |
      | 5    | 7    | sub       | -2     |
      | 5    | 7    | mul       | 35     |


    Scenario: Palindrome Checker
      Given I have a name "hannah"
      Then the name should be a palindrome