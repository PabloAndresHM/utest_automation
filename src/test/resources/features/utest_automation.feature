#Autor: Pablo Andres Hernandez Morales

  @stories
  Feature: Create a new account in Utest
    As User
    I want to create a new account in Utest
  @scenario1
  Scenario Outline: Create an account in utest
    Given that the user in the homepage go to Join Today
    When the user fill all the fields
    |name|last_name|email|city|zip|password|
    |<name>|<last_name>|<email>|<city>|<zip>|<password>|
    Then the account is create successful
    |text_successfull|
    |<text_successfull>|
    Examples:
      |name|last_name|email|city|zip|password|text_successfull|
    |pablo andres|Hernandez|phernandezm@choucairtesting.com|Medellín|050016|contraPrueba#12|The last step|