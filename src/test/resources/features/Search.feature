Feature:

  @SearchSuccessfull
  Scenario Outline:
    Given El usuario entra a la aplicacion
    When  El usuario ingresa <producto> a buscar
    Then  El usuario debe ver opciones del producto buscado <validproducto>
    Examples:
    |producto|validproducto|
    |Blouse  |Blouse       |