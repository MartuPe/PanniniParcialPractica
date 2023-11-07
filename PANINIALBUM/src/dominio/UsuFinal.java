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

	public void intercambiarFigu(Figurita figu, Figurita figuArecibir) throws FiguritaNoDisponibleException {
		Figurita encontrada = buscarFigu(figu);

		if (encontrada != null) {
			stockFigus.remove(encontrada);
			stockFigus.add(figuArecibir);
		}

	}

	private Figurita buscarFigu(Figurita figu) throws FiguritaNoDisponibleException {
		for (Figurita figurita : figusPegadas) {
			if (figurita != null) {
				throw new FiguritaNoDisponibleException();
			}
		}

		for (Figurita figurita : stockFigus) {
			if (figurita != null) {
				return figurita;
			}else {
				throw new FiguritaNoDisponibleException();
			}
		}
		return null;
	}

}
