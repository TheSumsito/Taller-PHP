<%-- 
    Document   : agregarEmpleado
    Created on : Jun 20, 2019, 6:58:18 PM
    Author     : mjara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<body>
    <form action="agregarEmpleado" method="post">
        <div>
            <h3>Ingrese Nombre</h3>
            <input type="text" name="txtNombre" id="txtNombre">
        </div>
        <div>
            <h3>Ingrese Apellido</h3>
            <input type="text" name="txtApellido" id="txtApellido">
        </div>
        <div>
            <h3>Ingrese Rut</h3>
            <input type="text" name="txtRut" id="txtRut">
        </div>
        <div>
            <h3>Ingrese Edad</h3>
            <input type="text" name="txtEdad" id="txtEdad">
        </div>

        <div>
            <input type="submit" value="Grabar">
        </div>
    </form>
</body>

</html>