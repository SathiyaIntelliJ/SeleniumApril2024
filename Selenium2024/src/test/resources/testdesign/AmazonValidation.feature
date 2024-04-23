Feature:Amazon search functionality
  @lmti @amazon2
    #before
  Scenario:search functionality
  When user type the product name "iPhone" in search box
  Then verify the search result
    #after

  @multiple
  Scenario Outline:Multiple
  When user type the product name "<SearchProduct>" in search box
  Then verify the search result
    Examples:
      |SearchProduct|
      |iphone|
      |laptop|
      |powerbank|


  @amazon01
      #before
  Scenario: handle the static drop down
    Given Navigate to Amazon home page
      When user selects the required value from the category drop down
      Then user extracts the drop down value
      #after

  @amazon03
  Scenario:handle the mouse actions
    Given User selects the baby wishlist

    @drag01
    Scenario:drog and drop
      Given user drag and drops

