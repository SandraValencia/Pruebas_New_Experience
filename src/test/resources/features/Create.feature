Feature: Create_Account

  @CreateSuccessful
  Scenario Outline: Create_Account
    Given El usuario ingresa a la aplicacion
    When  El usuario ingresa <email> <nombre> <apellido> <contrasena> <nombre_1> <apellido_1> <compania> <direccion> <direccion_1> <ciudad> <codigo_postal> <informacion> <telefono> <celular> <asignar_direccion>
    Then  El usuario debe ver formulario para ingresar sus datos<validtext>
    Examples:
    |email|nombre|apellido|contrasena|nombre_1|apellido_1|compania|direccion_1|ciudad|codigo_postal|informacion|telefono|celular|asignar_direccion|validtext|
    |svalencia@gmail.com|sandra|valencia|1234*|sandra|valencia|testercompany|calle 4|05000|prueba|5313456| 311234567           |casa|create an account|