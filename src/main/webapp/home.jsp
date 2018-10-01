<%@page import="com.ipartek.formacion.libro.model.LibroArrayListDAO"%>
<%@page import="com.ipartek.formacion.libro.pojo.Libro"%>
<%@include file="includes/header.jsp" %>
	
<%@include file="includes/navbar.jsp" %>		
	<!-- Page Content -->
	<div class="container">
		<%@ include file="includes/alert.jsp"  %>
		<div class="row">
			<div class="col-lg-9">
				<div class="card mt-4">
					<div class="card-body">
						<i class="fas fa-less-than"></i><a href=""> Anterior</a>
						<a href=""/> Siguiente</a><i class="fas fa-greater-than"></i>
					</div><!--fin div card-body -->
					
                    
                    <c:if test="${not empty sessionScope.usuario}">			
					<p class="libro">${usuario.nombre} ${usuario.pass}</p>
					<div class="form-group">
                            <label for="texto" class="required">Páginas que quieres escribir</label>
                            <input name="texto" type="text" class="form-control" id="texto" autofocus required/>
                    </div>
					<c:forEach items="${libro}" var="l" varStatus="status">
						<div class="form-group">
		                        <textarea id="desc" class="form-control" name="libro" placeholder="" rows="30" />
			                        Pagina: ${l.paginas}
			                        ${l.libro}
			                        Escrito por: ${l.autor}
		                         </textarea>
		                 </div>
					</c:forEach>
					
	        		</c:if>
	        		<c:if test="${empty sessionScope.usuario}">			
					<c:forEach items="${libro}" var="l" varStatus="status">
						<div class="form-group">
		                        <textarea id="desc" class="form-control" name="libro" placeholder="" rows="30" />
			                        Pagina: ${l.paginas}
			                        ${l.libro}
			                        Escrito por: ${l.autor}
		                         </textarea>
		                 </div>
					</c:forEach>

	        		</c:if>
					
	
					<div class="card-body">
						<i class="fas fa-less-than"></i><a href=""> Anterior</a>
						<a href=""> Siguiente</a><i class="fas fa-greater-than"></i>
					</div><!--fin div card-body -->
				</div><!-- fin div card mt-4-->

	
				</div> <!-- /.col-lg-9 -->
	
			</div> <!-- div row -->
	
		</div> <!-- /.container -->
<%@include file="includes/footer.jsp" %>	
		