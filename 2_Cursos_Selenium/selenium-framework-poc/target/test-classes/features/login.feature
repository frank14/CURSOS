Feature: Ingreso de usuario

  Background: Ingresar a la plataforma TRONOS-EIGHT
    Given un usuario administrativo quiere acceder a su cuenta en la plataforma TRONOS-EIGHT

  @Test
  Scenario: Ingreso exitoso
    When el usuario envie su nombre de usuario y contraseña validos
    Then el sistema debe redireccionarlo a la ventana principal
    And el usuario cierra sesión

  @Test
  Scenario: Ingreso fallido
    When el usuario envie su nombre de usuario y contraseña incorrectos
    Then el sistema debe mostrarle un mensaje de error
