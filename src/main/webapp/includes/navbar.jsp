<!-- Navigation -->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="inicio"><img src="images/logo.png" class="logo"></a>
     	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
       		<span class="navbar-toggler-icon"></span>
     	</button>


		<div class="collapse navbar-collapse" id="navbarResponsive">
	       	<ul class="navbar-nav ml-auto">
				<li class="nav-item active">
					<!-- usuario sin pasar por login -->
					<c:if test="${empty sessionScope.usuario}">
						<ul class="navbar-nav mr-auto">
		      			<li class="nav-item active">
		        			<a class="nav-link" href="inicio">Leer Libro</a>
		      			</li>
		      			<li class="nav-item">
		        			<a class="nav-link" href="login.jsp">Iniciar sesion</a>
		      			</li>
		    		</ul>
			       </c:if>         
			      </li>            
	       	</ul>   
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<!-- usuario logeado -->
			    <c:if test="${not empty sessionScope.usuario}">
		    		<ul class="navbar-nav mr-auto">
		      			<li class="nav-item active">
		        			<a class="nav-link"><i class="fas fa-user">${usuario.nombre}</i></a>
		      			</li>
		      			<li class="nav-item">
		        			<a class="nav-link" href="privado/escribir.jsp">Escribir Página</a>
		      			</li>
		      			<li class="nav-item">
		        			<a class="nav-link" href="">Ir a Página</a>
		      			</li>
		      			<li class="nav-item">
		        			<a class="nav-link disabled" href="logout">Cerrar Session</a>
		      			</li>
		    		</ul>
				</c:if>
	  		</div>
       </div>
   </div>
 </nav>