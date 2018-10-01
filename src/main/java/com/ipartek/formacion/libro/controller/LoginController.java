package com.ipartek.formacion.libro.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.formacion.libro.pojo.Alert;
import com.ipartek.formacion.libro.pojo.Usuario;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String usuario1="William";
	public static final String pass1="Shakespeare";
	public static final String usuario2="cervantes";
	public static final String pass2="saavedra";
	public static final String usuario3="pablo";
	public static final String pass3="neruda";
	public static final String usuario4="paulo";
	public static final String pass4="cohelo";
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Alert alert = new Alert();
		HttpSession session = request.getSession();
		
		try {
			
			//recoger parametros
			String usuarioNombre = request.getParameter("usuario");
			String pass = request.getParameter("pass");
				
			//comprobar usuario TODO contra BBDD
			if ( pass.equals(pass1) && usuarioNombre.equals(usuario1) || 
				 pass.equals(pass2) && usuarioNombre.equals(usuario2)  ||
				 pass.equals(pass3) && usuarioNombre.equals(usuario3)||
				 pass.equals(pass4)&& usuarioNombre.equals(usuario4))  {
				
				alert.setTexto("Bienvenido " + usuarioNombre );
				alert.setTipo(Alert.PRIMARY);
				
				//guardar Usuario en session
				Usuario u = new Usuario(usuarioNombre, pass);
				
				session.setAttribute("usuario", u);
				session.setMaxInactiveInterval(60*5); // 5min
				
			}else{
				
				alert.setTexto("Credenciales incorrectas" );
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.setAttribute("alert", alert);
			//request.getRequestDispatcher("home.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath() + "/inicio" ); 
		}
		
		
	}

}