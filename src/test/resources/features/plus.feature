Feature: As a potential client I need to open a calculator and multiply numbers

  @Smoke @Plus
  Scenario Outline: Plus operation
    When I input <firstNumber>
    And I press plus button
    And I input <secondNumber>
    Then I get <result>
    Examples:
      | firstNumber | secondNumber | result |
      |      7      |      8       |   15   |
      |     23      |     456      |  479   |