Feature: Login

  @LoginSuccessful
  Scenario Outline: Login
    Given El usuario abre la aplicacion New Experience
    When  El usuario ingresa <email> y <contrasena>
    Then  El usuario debe ver su cuenta <validtexto>
    Examples:
    |email|contrasena|validtexto|
    |svalencia@gmail.com|123456789|My account|