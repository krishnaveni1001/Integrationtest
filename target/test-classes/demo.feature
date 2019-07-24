Feature: Cargo UI

  Scenario: RFQ data verification
    Given I login to CargoUI
    And I give username and password
    And I click OK button
    And I enter to RFQ to verify RFQ number
    Then the data should match for the entered RFQ
