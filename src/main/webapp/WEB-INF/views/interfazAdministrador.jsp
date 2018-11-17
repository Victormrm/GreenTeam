<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<title>Fichajes</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style>
.fichaje-container {
	margin-right: 10%;

}
.gestion-container {

	margin-left: 10%;
}

.historial-container {
	margin-top: 5%;
}

.gestion-form {
	padding: 5%;
	box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0
		rgba(0, 0, 0, 0.19);
}

.gestion-form h3 {
	text-align: center;
	color: #333;
}

.historial-form {
	padding: 5%;
	background: #0062cc;
	box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0
		rgba(0, 0, 0, 0.19);
}

.historial-form h3 {
	text-align: center;
	color: #fff;
}

.historial-form h4 {
	color: #fff;
}

.btnUsuario {
	width: 50%;
	border-radius: 2rem;
	padding: 0%;
	border: solid;
	cursor: pointer;
	margin-bottom: 5px;
	font-weight: 600;
	color: #fff;
	background-color: #0062cc;
}

.btnFichajes {
	border-radius: 2rem;
	border: solid;
	cursor: pointer;
	font-weight: 600;
	color: #fff;
	background-color: #0062cc;
}

.btn-xl {
    padding: 10px 20px;
    font-size: 20px;
    border-radius: 10px;
}


.btn-space {
    margin-right: 5px;
}
.btn-verticalspace{
	margin-bottom:30px;
}

.centerdiv {
  display: flex;
  justify-content: center;
}

.historial{
padding: 15px;
}

.inlinediv{
float: left;
}

.h1div{
display: flex;
  justify-content: center;
  margin-bottom:30px;

}

.btnAbrir{
 padding: 10px 20px;
    font-size: 20px;
    border-radius: 10px;
margin-bottom:30px;
margin-right: 10px;

}

.btnCerrar{

 padding: 10px 20px;
    font-size: 20px;
    border-radius: 10px;
margin-bottom:30px;
}

.btnListar{
 padding: 15px 15px;
    font-size: 15px;
    border-radius: 15px;
margin-bottom:10px;	
}

.logo{

width:180px;
height:180px
}
</style>


</head>

<body>

	<nav class="navbar navbar-inverse" style="background-color: #337ab7;">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"></a>
			</div>
			<div class="nav-item pull-left fixed-top"
				style="position: relative; top: 8px">
				<form action="inicio" method="GET">
					<button class="btn btn-space" type="submit">
						<strong><span class="glyphicon glyphicon-sort"></span>
							Fichajes</strong>
					</button>
				</form>
			</div>
			<div class="nav-item pull-left  fixed-top"
				style="position: relative; top: 8px">
				<form action="fichajes" method="GET">
					<button class="btn btn-space " type="submit">
						<strong><span class="glyphicon glyphicon-copy"></span>
							Gestionar Incidencias</strong>
					</button>
				</form>
			</div>
			<div class="nav-item pull-left fixed-top"
				style="position: relative; top: 8px">
				<form action="Incidencias" method="GET">
					<button class="btn btn-space" type="submit">
						<strong><span class="glyphicon glyphicon-cog"></span>
							Gestionar Contrase�a</strong>
					</button>
				</form>
			</div>
			<div class="nav-item pull-right fixed-top"
				style="position: relative; top: 8px">
				<form action="logout" method="GET">
					<button class="btn btn-danger" type="submit">
						<strong><span class="glyphicon glyphicon-log-out"></span>Salir</strong>
					</button>
				</form>
			</div>
		</div>
	</nav>

	<center>
		<br /> <img src="https://i.imgur.com/bwlSMSI.png" style="width: %;">
		<br />
	</center>



	<div class="container fichaje-container col-md-4">
		<div class="row">

			<div class="container centerdiv">

				<div class="inlinediv">
					<form action="abrirFichajeAdmin" method="post">
						<button type="submit" id="btnAbrir" class="btn btn-primary btnAbrir btnFichajes" value="Abrir Fichaje">Abrir Fichaje</button>
					</form>
				</div>

				<div class="inlinediv ">
					<form action="cerrarFichajeAdmin" method="post">
						<button type="submit" id="btnCerrar" class="btn btn-primary btnCerrar btnFichajes" value="Cerrar Fichaje">Cerrar Fichaje</button>
					</form>
				</div>

			</div>

<div class="centerdiv">
	<span style="color:red"><em>${errorMessageCerrar}</em></span>
		<span style="color:red"><em>${errorMessageAbrir}</em></span>
	</div>


	<div class="collapse.in" id="panelFichajes">
	
	<form id="formListar" action="listarFichajesAdmin" method="get">
				<button id="btnListar"  class="btn btn-primary btnListar btnFichajes" type="submit" data-toggle="collapse.in" data-target="#panelFichajes" aria-expanded="false" aria-controls="panelFichajes">Listar Fichajes</button>
			</form>
			
		<table class="table table-bordered">
			<thead class="thead">
				<tr>
					<th scope="col">Fecha</th>
					<th scope="col">Entrada</th>
					<th scope="col">Salida</th>
					<th scope="col">Estado</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listafichajesAd}" var="fichaje">
					<tr>
						<td class="col-md-2">${fichaje.fechaFichaje}</td>
						<td class="col-md-2">${fichaje.horaEntrada}</td>
						<td class="col-md-2">${fichaje.horaSalida}</td>
						<td class="col-md-2" onload="switchState();" id="tdState">${fichaje.estado}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

		</div>

	</div>





	<div class="container gestion-container col-md-4">
		<div class="row">
			<h2>
				<span class=" glyphicon glyphicon-asterisk"></span> Gesti�n de usuarios
			</h2>


			<div class="gestion-form center-div">
				<form method = "get">

					<div class="form-inline text-center" style="margin: auto;">

							
							<input type="submit" class="btnUsuario input-lg"
								name="crearUsuario" value="Crear usuario" formaction = "interfazCrearUsuario" />
							
							<input type="submit" class="btnUsuario input-lg"
								name="modificarUsuario" value="Modificar usuario" formaction = "interfazModificarUsuario"/>
						
							<input type="submit" class="btnUsuario input-lg"
								name="eliminarUsuario" value="Eliminar usuario" formaction = "interfazEliminarUsuario"/>
					
					</div>
				</form>
			</div>

		</div>

	</div>
</body>
</html>