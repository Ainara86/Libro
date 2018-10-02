package com.ipartek.formacion.libro.model;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.libro.pojo.Libro;
import com.ipartek.formacion.libro.pojo.Usuario;



public class UsuarioArrayListDAO implements CrudAble<Usuario> {
	
	private static UsuarioArrayListDAO INSTANCE = null;
	private static List<Usuario> usuarios = null;

	private UsuarioArrayListDAO() {
		usuarios = new ArrayList<Usuario>();
		try {
			usuarios.add(new Usuario(1,"William", "Shakespeare"));
			usuarios.add(new Usuario(2,"Cervantes", "Saavedra"));
			usuarios.add(new Usuario(3,"Pablo", "Neruda"));
			usuarios.add(new Usuario(4,"Pablo", "Cohelo"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static synchronized UsuarioArrayListDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UsuarioArrayListDAO();
		}

		return INSTANCE;
	}

	@Override
	public boolean insert(Usuario pojo) {
		return usuarios.add(pojo);
	}

	@Override
	public List<Usuario> getAll() {
		return usuarios;
	}


	@Override
	public boolean update(Usuario pojo) {
		return false;
	}

	@Override
	public Usuario getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}