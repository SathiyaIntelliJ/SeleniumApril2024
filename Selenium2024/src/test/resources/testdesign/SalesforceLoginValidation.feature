Feature:Login validation of salesforce application

    @sc01 @lmti
    Scenario: login functionality with valid combination
    Given user navigates to salesforce login page
    When user enters the username "Sathya" and password "1234"
    And  user clicks on login button
    Then Verify whether the  user navigates to home page
    And Verify the Title

  @sc02 @lmti @cred
  Scenario Outline: login functionality with invalid combination
    When user enters the username "<username>" and password "<password>"
    And user clicks on login button
    Then Verify the Error Message
    Examples:
      | username | password |
      | Sathiya  | 111      |
      | Vijay    | 123      |
      | Mithra   | 456      |

  @excel
Scenario:
  Given user enter the credentials


