package dominio;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UsuFinal extends Usuario {

	private Set<Figurita> stockFigus;
	
	public UsuFinal(String nombre) {
		super(nombre);
		stockFigus = new TreeSet<>();
	}

	@Override
	public void agregarFigurita(Figurita figu) {
		stockFigus.add(figu);		
	}


	public Set<Figurita> getFiguritasEnStock() {
		return stockFigus;
	}

}
