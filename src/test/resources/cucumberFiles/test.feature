Feature:
  Scenario:
    Given I am on the Login page URL "http://localhost:8888/index.php?"
    When I enter username as "admin"
    And I enter password as "password"
    And click on login button
    Then I sould see application homepage