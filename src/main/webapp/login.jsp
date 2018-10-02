<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="includes/header.jsp" %>

    <div class="contenedor">

		<%@ include file="includes/navbar.jsp" %>

        <main role="main" class="container">
        	
        	<%@ include file="includes/alert.jsp"  %>

            <div class="row justify-content-center">
                <h1 class="col col-md-6"><i class="fas fa-user"></i> Login</h1>
            </div>
                    
            <div class="row justify-content-center">
                <small id="login-small" class="col col-md-6">Los campos con * son obligatorios</small>
            </div>

            <form id="login-form" action="login" method="post">
			
                <div class="form-row justify-content-center">
                            
                    <div class="col col-md-6">
                        
                        <div class="form-group">
                            <label for="usuarioNombre" class="required">Email</label>
                            <input name="usuarioNombre" type="text" class="form-control" id="usuarioNombre" autofocus required placeholder="Ej: paco" />
                        </div>
                                    
                        <div class="form-group">
                            <label for="pass" class="required">Contraseña</label>
                            <input name="pass" type="password" class="form-control" id="pass" required placeholder="Contraseña del usuario" />
                        </div>
                                    
                        <button type="submit" class="btn btn-outline-primary btn-block">Acceder</button>
                                    
                    </div>
                                    
                </div>
                            
            </form>

        </main>
    </div> <!-- /.contenedor -->
<%@ include file="includes/footer.jsp" %>