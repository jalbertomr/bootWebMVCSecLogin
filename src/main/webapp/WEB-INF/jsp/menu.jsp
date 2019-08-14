<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${pageContext.request.contextPath}/inicio">Inicio</a> | &nbsp;

	<a href="${pageContext.request.contextPath}/altaEmpleado">Alta Empleado</a> |   
	<a href="${pageContext.request.contextPath}/listaEmpleados">Lista Empleados</a> |   
	<u><h2 style="color: blue;">
    <a onclick="document.forms['logoutForm'].submit()">Salir</a>
    </h3></u>

    <form id="logoutForm" method="POST" action="${contextPath}/logout">
    </form>

</div>