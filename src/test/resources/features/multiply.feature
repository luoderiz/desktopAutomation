Feature: As a potential client I need to open a calculator and multiply numbers

  @Smoke @Multiply
  Scenario Outline: Multiply Operation
    When I input <firstNumber>
    And I press multiply button
    And I input <secondNumber>
    Then I get <result>
    Examples:
      | firstNumber | secondNumber | result |
      |      4      |       8      |   32   |
      |      40     |       60      |  2400   |