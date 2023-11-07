package dominio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Administrador extends Usuario {

	private Set<Figurita> figuritasDadasDeAlta;
	
	public Administrador(String nombre) {
		super(nombre);
		figuritasDadasDeAlta = new TreeSet<>();
	}

	@Override
	public void agregarFigurita(Figurita figu) throws CodigoExistenteException {
		if(!figuritasDadasDeAlta.contains(figu)) {
			figuritasDadasDeAlta.add(figu);
		}else {
			throw new CodigoExistenteException();
		}
		
	}

	public Set<Figurita> getFiguritasDadasDeAlta() {
		return figuritasDadasDeAlta;
	}

	public void setFiguritasDadasDeAlta(Set<Figurita> figuritasDadasDeAlta) {
		this.figuritasDadasDeAlta = figuritasDadasDeAlta;
	}



}
