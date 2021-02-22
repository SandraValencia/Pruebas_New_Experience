Feature: Como usuario quiero buscar un producto para comprarlo

  @SearchSuccessful
  Scenario Outline: Buscar producto
    Given el usuario entra a la aplicacion
    When el usuario ingresa <producto> a buscar
    Then el usuario debe ver opciones de producto buscado <validproducto>
    Examples:
    |producto|validproducto|
    |Blouse|BLOUSE|