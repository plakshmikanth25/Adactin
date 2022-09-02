@CancelBooking
Feature: verifying cancel the order id in adactin hotel page

  Scenario Outline: verifying adactin hotel cancel booking order id
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should search "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>" and "<childrensPerRoom>"
    Then User should verify after search hotel "Select Hotel "
    And User should select hotel name
    Then User should verify after select hotel name "Book A Hotel "
    And User should book hotel "<firstname>","<lastname>" and "<address>"
      | creditCardNo     | creditCardType   | expMonth | expYear | cvvNumber |
      | 1234567812345678 | American Express | January  |    2020 |       123 |
      | 8765432187654321 | VISA             | February |    2021 |       435 |
      | 2456678876543211 | Master Card      | March    |    2022 |       675 |
      | 7554243654487674 | Other            | April    |    2023 |       436 |
    Then User should verify after book hotel "Booking Confirmation "
    And User should cancel order id
    Then User should verify after cancel order id "The booking has been cancelled."

    Examples: 
      | username         | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstname | lastname | address    |
      | lakshmikanth1804 | Lakshmi@1804 | Sydney   | Hotel Creek | Standard | 1 - One   | 17/08/2022  | 18/08/2022   | 1 - One       | 1 - One          | Vignesh   | jayabal  | mannargudi |

  Scenario Outline: verifying adactin hotel cancel existing booking order id
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"
    And User should cancel existing order "<orderId>"
    Then User should verify after cancel order id "The booking has been cancelled."

    Examples: 
      | username         | password     | orderId    |
      | lakshmikanth1804 | Lakshmi@1804 | XSTJRW7M86 |
