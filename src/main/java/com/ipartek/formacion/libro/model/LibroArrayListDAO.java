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
			libro.add(new Libro("pagina0", 1,"Erase una vez... Una noche clara y estrellada, una siniestra figura llamada yafar condujo a un taimado ladrón hasta una cueva secreta del desierto: la cueva de las maravillas.\n" + 
					"Cuando la magnífica cabeza de tigre esculpida asomó por la arena y dejó al descubierto la entrada de la cueva, yafar ordenó al ladrón que entrara en ella.\n" + 
					"-Traéme la lámpara. el resto es para tí, pero la lámpara es mía.\n" + 
					"La cabeza de tigre detuvo al ladrón.\n" + 
					"-Tienes que saber algo: sólo aquel cuyos harapos cubren un corazón puro podrá entrar aquí... el diamante en bruto.\n" + 
					"Yafar se volvió hacia iago, su compañero loro:\n" + 
					"-Debo encontrar... a ese \"diamante en bruto\".\n" + 
					"", " pablo neruda"));
			libro.add(new Libro("pagina1", 2,"LEJOS DE ALLÍ, EN EL MERCADO DE ÁGRABAH, UN JOVEN VESTIDO CON HARAPOS INTENTABA SALVAR EL PELLEJO DESPUÉS DE HABER ROBADO UNA BARRA DE PÁN.\n" + 
					"\n" + "EL JOVEN, LLAMADO ALADDÍN, LOGRÓ ESCAPAR CON LA AYUDA DE SU MONO Y COMPAÑERO DE AVENTURA, ABÚ. SENTADO EN UN TEJADO, CON EL TROZO DE PAN SECO EN LA MANO, ALADDÍN MIRÓ CON TRISTEZA A SU ALREDEDOR.\n" + 
					"\n" + "-ALGÚN DÍA, ABÚ, CAMBIARÁ. VESTIREMOS ROPA DE CALIDAD EN VEZ DE HARAPOS, Y ESTAREMOS DENTRO DE UN PALACIO MIRANDO HACIA AFUERA... EN VEZ DE ESTAR AFUERA, MIRANDO HACIA ADENTRO.", " pablo neruda"));
			libro.add(new Libro("pagina2", 3,"CERCA DE ALLÍ, EN LOS JARDINES DEL PALACIO REAL, EL SULTÁN TEMÍA QUE SU HIJA LA PRINCESA JASMÍN, TAMPOCO ACEPTARA A SU ÚLTIMO PRETENDIENTE.\n" + 
					"\n" + "-QUERIDA, DEBES DEJAR DE RECHAZAR A TODOS LOS PRETENDIENTES QUE VIENEN A PEDIR TU MANO. LA LEY DICE QUE DEBES CASARTE CON UN PRÍNCIPE EN TU PRÓXIMO CUMPLEAÑOS.\n" + 
					"\n" + "JASMÍN ACARICIÓ CON TRISTEZA A SU TIGRE RAJÁ:\n" + 
					"\n" + "-PAPÁ, SI ME CASO, QUIERO QUE SEA POR AMOS.", " Cervantes saavedra"));
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
		Libro resul = null;
		if (id != null) {
			for (Libro l : libro){
				if (id.equals(l.getId())) {
					resul = l;
				}
			}
		}
		return resul;
	}

	@Override
	public boolean update(Libro pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		boolean resul = false;
		Libro l = null;
		if ( id != null ) { 
			for (int i = 0; i < libro.size(); i++) {
				l = libro.get(i); 
				if (id.equals(l.getId()) ) { 
					resul = libro.remove(l);
					break;
				}
			}
		}	
		return resul;
	}

}