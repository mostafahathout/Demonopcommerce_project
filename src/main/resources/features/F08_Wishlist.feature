@smoke
Feature: verify wish list button is working correctly
Scenario: user clicks on wish list button for 3rd item

When user clicks on wish list button
Then success message is  displayed
And background color is green

  Scenario: adding selected items

    When user clicks on wish list button
    Then success message is  displayed
    And user clicks on wish list tab to check on added items
  Scenario: verify that user can add his favour product in wishlist
    Given   User Search products
    When    user clicks on wish list button
    And    User wait to be sure product to add
    And   User go to Wishlist Tab
    Then  User make sure about the quantity added