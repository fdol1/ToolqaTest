#language: es

Característica: Realizar registro de uno o mas usuarios en Tools qa

  Antecedentes:
    Dado que fer ingresa a la pagina de ToolsQa

  @RutaCritica
  @RegistroDeUsuario
  Esquema del escenario: Realizar registro de usuario
    Dado que fer ingresa al registro de usuario
    Cuando ingresa los datos de registro
      | usuarioRegistro   | claveRegistro   |
      | <usuarioRegistro> | <claveRegistro> |
    Entonces se muestra el mensaje Sign up successful
    Ejemplos:
      | usuarioRegistro | claveRegistro |
      | prueba6usuario  | 1234          |
