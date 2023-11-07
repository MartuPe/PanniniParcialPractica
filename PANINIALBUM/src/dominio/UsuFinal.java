package dominio;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UsuFinal extends Usuario {

	private Set<Figurita> stockFigus;
	private ArrayList<Figurita> figusPegadas;

	public UsuFinal(String nombre) {
		super(nombre);
		stockFigus = new TreeSet<>();
		figusPegadas = new ArrayList<>();
	}

	@Override
	public void agregarFigurita(Figurita figu) {
		stockFigus.add(figu);

	}

	public void pegarFigu(Figurita figu) throws FiguritaRepetidaException {
		if (!figusPegadas.contains(figu)) {
			figusPegadas.add(figu);
		} else {
			throw new FiguritaRepetidaException();
		}

	}

	public Set<Figurita> getFiguritasEnStock() {
		return stockFigus;
	}

	public ArrayList<Figurita> getFigusPegadas() {
		return figusPegadas;
	}



}
