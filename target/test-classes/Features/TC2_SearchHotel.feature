@SearchHotel
Feature: verifying search hotel in adactin hotel page

  
  Scenario Outline: verifying adactin search hotel by select all fields
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify after search hotel "Select Hotel "

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 27/08/2022  | 28/08/2022   | 1 - One       | 1 - One          |

  Scenario Outline: verifying adactin search hotel page with mandatory field
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search hotel select all mandatory fields "<location>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>" and "<adultsPerRoom>"
    Then User should verify after search hotel "Select Hotel "

    Examples: 
      | username         | password     | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | 1 - One   | 27/08/2022  | 28/08/2022   | 1 - One       |

  Scenario Outline: verifying adactin search hotel page with Invalid dates
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 30/08/2022  | 28/08/2020   | 1 - One       | 1 - One          |

  Scenario Outline: verifying adactin search hotel page without entering values
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should click search
    Then User should verify after error message "Please Select a Location"

    Examples: 
      | username         | password     |
      | lakshmikanth1804 | Lakshmi@1804 |
