Feature: Validation of ACME Demo application

  @lmti
  Scenario:
    Given User logged into ACME Login Page
    When User clicks card types
    Then Verify whether user can view fields "Credit cards" and "debit cards" which is available under card types

  @lmti
    Scenario:
      Given User navigates to the Message
      When User review the Message
      Then Verify whether user can see the time foramt "HH:MM:SS" in the Message "Your nearest branch closes in"

    Scenario:
        Given User Navigates to Financial Overview
        When User review the Financial Overview Session
        Then Verify if the user can see the Sections "Total Balance","Credit Available",Due Today" under Financial Overview Session.
