Feature: As a potential client I need to open a calculator and subtract numbers

  @Smoke @Minus
  Scenario Outline: Minus Operation
    When I input <firstNumber>
    And I press minus button
    And I input <secondNumber>
    Then I get <result>
    Examples:
      |firstNumber|secondNumber| result |
      |      9     |       8      |   1   |
      |      52     |      12      |  40   |