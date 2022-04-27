#language:en
#Autor: Jhonatan Paternina Rojas

@stories
Feature: Web Automation Demo Site
  Como usuario, quiero acceder a la web Automation Demo Site
  para realizar el registro en la pagina
  y verificar que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row

  @Scenarios
  Scenario Outline: verificar que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row
    Given que Carlos quiere acceder a la Web Automation Demo Site
    When el realiza el registro en la pagina
      | firt_name   | last_name   | address   | email_address   | phone   | skills   | country   | year   | month   | day   | password   | confirm_password   |
      | <firt_name> | <last_name> | <address> | <email_address> | <phone> | <skills> | <country> | <year> | <month> | <day> | <password> | <confirm_password> |
    Then el verifica que se carga la pantalla con texto
      | verify_text   |
      | <verify_text> |

    Examples:
      | firt_name | last_name | address  | email_address           | phone      | skills | country | year | month    | day | password | confirm_password | verify_text                                     |
      | Jhonatan  | Paternina | Monteria | jhonatanpater@gmail.com | 3016238569 | PHP   | Australia   | 1993 | December | 2   | 123456   | 123456           | Double Click on Edit Icon to EDIT the Table Row |



