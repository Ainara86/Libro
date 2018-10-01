package com.ipartek.formacion.libro.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.formacion.libro.model.LibroArrayListDAO;
import com.ipartek.formacion.libro.pojo.Libro;
import com.ipartek.formacion.libro.pojo.Usuario;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/inicio")
public class HomeController extends HttpServlet {
private static final long serialVersionUID = 1L;

private static LibroArrayListDAO dao;
private ArrayList<Libro> libro;	
private Libro libroInicio;


@Override
public void init(ServletConfig config) throws ServletException {	
	super.init(config);
	//Se ejecuta solo con la 1º petición, el resto de peticiones iran a "service"
	dao = LibroArrayListDAO.getInstance();
}


@Override
public void destroy() {	
	super.destroy();
	//se ejecuta al parar el servidor
	dao = null;
}


/**
 * Cada request se ejecuta en un hilo o thread
 */
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	HttpSession session = request.getSession();
	
	super.service(request, response);  //llama a los metodos GET o POST
			
	//despues de realizar GET o POST
	request.setAttribute("libro", libro);
	request.getRequestDispatcher("home.jsp").forward(request, response);
	
}


/**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
 *      response)
 */
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	doProcess(request, response);
	
}

private void doProcess(HttpServletRequest request, HttpServletResponse response) {
try {
		
		//parametros
		String id = request.getParameter("id");
		
		//listado 			
		libro = (ArrayList<Libro>) dao.getAll();
		
		
		//libro de inicio
			/*libroInicio = new Libro();
			for(int i=0;i<libro.size();i++) {
				libro = (ArrayList<Libro>) dao.getAll();;
			}*/
		//request.setAttribute("libro", dao.getAll());

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		
	}
	
}


/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
 *      response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	/*try {
		
		//recoger parametros
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		
		//insertar
		libroInicio = new Libro(id, 0, nombre, nombre);
		dao.insert(libroInicio);
		
		//pedir listado			
		libro = (ArrayList<Libro>) dao.getAll();
		

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		
	}*/
}

}