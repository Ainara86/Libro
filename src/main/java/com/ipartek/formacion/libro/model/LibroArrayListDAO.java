package com.ipartek.formacion.libro.model;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.libro.pojo.Libro;

public class LibroArrayListDAO implements CrudAble<Libro> {

	private static LibroArrayListDAO INSTANCE = null;
	private static List<Libro> libro = null;

	private LibroArrayListDAO() {
		libro = new ArrayList<Libro>();
		try {
			Libro p = new Libro();
			p.setAutor("Anonimo");
			libro.add(p);
			libro.add(p);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static synchronized LibroArrayListDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LibroArrayListDAO();
		}

		return INSTANCE;
	}

	@Override
	public boolean insert(Libro pojo) {
		return libro.add(pojo);
	}

	@Override
	public List<Libro> getAll() {
		return libro;
	}

	@Override
	public Libro getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Libro pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Libro paginaXPos(int nPagina) {
		Libro p = new Libro();
		p = libro.get(nPagina);
		return p;
	}
	
	public int total() {
		return libro.size();
	}

}