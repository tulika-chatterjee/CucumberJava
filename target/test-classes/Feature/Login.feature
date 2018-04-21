Feature: LoginFeature
  This login feature deals with the login functionality of application.

   @Start
  Scenario: Login with correct username and password
    Given I am on login page
    And I pass the login details as following
      | username | password      |
      | admin    | adminpassword |
    When I hit the login button
    Then I sould see the home page of platform

    @End
  Scenario Outline: Login with incorrect username and password
    Given I am on login page
    And I pass username as <username> and password as <password>
    When I hit the login button
    Then I should see the home page of platform

    Examples:
      | username | password |
      | admin    | adminpassword|
      | example  | examplepassword|