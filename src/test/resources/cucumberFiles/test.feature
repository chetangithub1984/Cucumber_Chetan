Feature: Testing feature

  Background:
    Given We are following background

  Scenario: Simple Parameter test
    Given I am on the Login page URL "http://localhost:8888/index.php?"
    When I enter username as "admin"
    And I enter password as "password"
    And click on login button
    Then I sould see application homepage


  Scenario Outline: Example Test
    Given I am a good Player
    When I play "<game>" and give my "<percentage>"
    Then I feel happy
    Examples:
      | game     | percentage |
      | football | 50         |
      | cricket  | 100        |

  Scenario: Data tables list example
    Given I am having a bike
    And I started bike and went to fruit market
    When I bought below mentioned fruits
      | banana | good food |
      | apple  | awesome   |
      | graps  | ok ok     |


  Scenario: Data tables Map example
    Given I am having a car
    And I started car and went to fruit market
    When I bought below mentioned fruit
      | fruit | taste   |
      | apple | awesome |
      | graps | ok ok   |