Feature:Validate Add User function

  Scenario Outline: Add a new Customer
    Given User Launch Chrome browser And User opens URL http://3.13.126.58/AMS3.0/home
    When User enters Email as "<Email>" and "<Password>"
    And Click on login
    Then User can view Dashboard
    When User click on Users menu
    And clicks Add New User button
    Then User can view Add New User page
    When User enters New User information "<FirstName>" "<LastName>" "<Company>""<Phone>" "<EmailAddress>" "<UserPassword>" and "<UserConfirmPassword>"
    And click on Add User button
    Then user can view added searching  their "<FirstName>"
    When user clicks on logout button
    Then user should logout
    When user enters "<NewloginEmail>" and "<Newpassword>" details
    Then new user should login successfully
    And close browser

    Examples:
      | Email | Password |FirstName|LastName|Company|Phone|EmailAddress|UserPassword|UserConfirmPassword|NewloginEmail|Newpassword|
      |admin@gic.com|Admin123|Arman|Kudlur|SiddanthEnterprises|07472170901|armankudlur6@gmail.com|Rohithrahul06|Rohithrahul06|armankudlur6@gmail.com|Rohithrahul06|
      |admin@gic.com|Admin123|Can|Erkmen|canltd|07738609667|canerkmen16@gmail.com|Rohithrahul08|Rohithrahul08|canerkmen16@gmail.com                 |Rohithrahul08|
      |canerkmen16@gmail.com|Rohithrahul08|Rahul|Kudlur|Rahulltd|9538556516|rahul06@gmail.com|Rohithrahul10|Rohithrahul10|rahul06@gmail.com         |Rohithrahul10|