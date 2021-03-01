Feature: Ingreso de usuario

  Background: Ingresar a la plataforma TRONOS-EIGHT
    Given un usuario administrativo quiere acceder a su cuenta en la plataforma TRONOS-EIGHT

  @Test
  Scenario: Ingreso con usuario registrado
    When el usuario envie su username y password validos
    Then el sistema debe redireccionarlo a la ventana principal
    And el usuario cierra sesion

  @Test
  Scenario: Ingreso con usuario no registrado
    When el usuario envie su username y password invalidos
    Then el sistema debe mostrarle un mensaje de error
