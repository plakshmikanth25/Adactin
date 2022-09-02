@Login
Feature: verifying login hotel page

  Scenario Outline: verifying adactin hotel app login with valid credentials
    Given user is on the adactin hotel app page
    When user should perform login "<username>", "<password>"
    Then user should verify after login message "Hello lakshmikanth1804!"

    Examples: 
      | username         | password     |
      | lakshmikanth1804 | Lakshmi@1804 |
	
  Scenario Outline: verifying adactin hotel app login with valid credentials Enter key
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>" with Enter key
    Then user should verify after login message "Hello lakshmikanth1804!"

    Examples: 
      | username         | password     |
      | lakshmikanth1804 | Lakshmi@1804 |

  Scenario Outline: verifying adactin hotel app login with Invalid credentials
    Given user is on the adactin hotel app page
    When user should perform login "<username>" and "<password>"
    Then user should verify after login error contains "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | username | password |
      | lakshmi  |    12345 |
