@SelectHotel
Feature: verifying search hotel in adactin hotel page

  Scenario Outline: verifying adactin select hotel name and verify book a hotel
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify after search hotel "Select Hotel "
    And User should select hotel name
    Then User should verify after select hotel name "Book A Hotel "

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 27/08/2022  | 28/08/2022   | 1 - One       | 1 - One          |

  Scenario Outline: verifying adactin select hotel page without select hotel name
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify after search hotel "Select Hotel "
    And User should click continue without select any hotel name
    Then User should verify error message "Please Select a Hotel"

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 27/08/2022  | 28/08/2022   | 1 - One       | 1 - One          |
