<!DOCTYPE html>
<html>
  <head>
    <title>Formulario de Usuario</title>
  </head>
  <body>
    <h1>Formulario de Usuario</h1>
    <form action="UsuarioController" method="post">
      <table>
        <tr>
          <td>Nombre:</td>
          <td><input type="text" name="nombre" required /></td>
        </tr>
        <tr>
          <td>Edad:</td>
          <td><input type="number" name="edad" required /></td>
        </tr>
        <tr>
          <td>Correo:</td>
          <td><input type="email" name="email" required /></td>
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="Enviar" /></td>
        </tr>
      </table>
    </form>
  </body>
</html>
