Feature: Como usuario quiero crear cuenta para comprar productos

  @CreateSuccessful
  Scenario Outline: Crear cuenta
    Given el usuario ingresa a la aplicacion
    When el usuario debe ingresar <email> <nombre> <apellido> <contrasena> <nombre1> <apellido1> <compania> <direccion> <direccion1> <ciudad> <codigopostal> <informacion> <telefono> <celular> <asignardireccion>
    Then el usuario debe ver el formulario para ingresar sus datos <validtext>
    Examples:
    |email|nombre|apellido|contrasena|nombre1|apellido1|compania|direccion|direccion1|ciudad|codigopostal|informacion|telefono|celular|asignardireccion|validtext|
    |scalderon1@gmail.com|sandra|valencia|1234*|sandra|valencia|testercompany|calle4|calle5|Medellin|05000|prueba|5313456|311234568|casa|MY ACCOUNT|