<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de Usuario</title>
</head>
<body>
    <form method="post">
    <h1>Resultados</h1>
    <p>Nombre: ${nombre}</p>
    <p>Edad: ${edad}</p>
    <p>${usuarioRegistrado}</p>

    
    <a href="index.jsp">Volver</a>
</form>
</body>
</html>
