@BookHotel
Feature: verifying book a hotel in adactin hotel page

  Scenario Outline: verifying adactin book hotel and verify booking confirmation a hotel
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify after search hotel "Select Hotel "
    And User should select hotel name
    Then User should verify after select hotel name "Book A Hotel "
    And User should book hotel "<firstname>","<lastname>" and "<address>"
      | creditCardNo     | creditCardType   | expMonth | expYear | cvvNumber |
      | 1234567812345678 | American Express | January  |    2022 |       123 |
      | 8765432187654321 | VISA             | February |    2022 |       435 |
      | 2456678876543211 | Master Card      | March    |    2022 |       675 |
      | 7554243654487674 | Other            | April    |    2022 |       436 |
    Then User should verify after book hotel "Booking Confirmation "

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstname    | lastname | address |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 27/08/2022  | 28/08/2022   | 1 - One       | 1 - One          | Lakshmikanth | P        | Chennai |

  Scenario Outline: verifying adactin book hotel without select any field
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify after search hotel "Select Hotel "
    And User should select hotel name
    Then User should verify after select hotel name "Book A Hotel "
    And User should click book now without select any field
    Then User should verify error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 27/08/2022  | 28/08/2022   | 1 - One       | 1 - One          |
