Feature: As a potential client I need to open a calculator and divide numbers

  @Smoke @Divide
  Scenario Outline: Divide Operation
    When I input <firstNumber>
    And I press divide button
    And I input <secondNumber>
    Then I get <result>
    Examples:
      | firstNumber | secondNumber | result |
      |      40     |       8      |   5    |
      |      1500     |      3       |   500   |