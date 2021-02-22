Feature: Como usuario loguearme para tener una cuenta en la pagina New Experience

  @LoginSuccessful
  Scenario Outline: Login
    Given el usuario abre la aplicacion
    When el usuario ingresa <email> y <contrasena>
    Then el usuario debe ver su cuenta <validtexto>
    Examples:
    |email|contrasena|validtexto|
    |svalencia@gmail.com|123456789|MY ACCOUNT|