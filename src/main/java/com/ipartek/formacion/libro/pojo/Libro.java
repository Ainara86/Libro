package com.ipartek.formacion.libro.pojo;

public class Libro {

	public static final int ID_LONGITUD = 11;
	
	private String id;
	private int paginas;
	private String libro;
	private String autor;
	
	public Libro() {
		super();
		this.id="";
		this.paginas = 3;
		this.libro = "Erase una vez...";	
		this.autor = "anonimo";
	}
	
	public Libro(String id, int paginas, String libro, String autor) throws Exception {
		this();
		this.id=id;
		this.paginas= paginas;
		this.libro = libro;
		this.autor = autor;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", paginas=" + paginas + ", libro=" + libro + ", autor=" + autor + "]";
	}

	
	
}