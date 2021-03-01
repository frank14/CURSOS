Feature: Registro de usuario

  Background: Registro en la plataforma TRONOS-EIGHT
    Given un usuario aspirante que quiere crear su cuenta en la plataforma TRONOS-EIGHT

  @Test
  Scenario: Registro exitoso
    When el usuario ingrese al formulario
    When el usuario seleccione su programa de interes
