package com.ipartek.formacion.libro.pojo;

public class Libro {

	private int numero;
	private String autor;
	private String contenido;

	public Libro() {
		super();
		this.numero = 3;
		this.autor = "anonimo";
		this.contenido = "Erase una vez...";
	}

	public Libro(int numero, String autor, String contenido) throws Exception {
		this();
		this.numero = numero;
		this.autor = autor;
		this.contenido = contenido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Libro [numero=" + numero + ", autor=" + autor + ", contenido=" + contenido + "]";
	}

	

}