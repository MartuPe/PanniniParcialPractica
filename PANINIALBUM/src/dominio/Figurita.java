package dominio;

import java.util.Objects;

public class Figurita implements Comparable<Figurita> {

	private String seleccion;
	private Integer numFigu;
	private Character letraGrupo;
	private String nombreJugador;
	private Double valor;

	public Figurita(String seleccion, Integer numFigu, Character letraGrupo, String nombreJugador, Double valor) {
		this.setCodigoIdentificatorio(seleccion, numFigu);
		this.letraGrupo = letraGrupo;
		this.nombreJugador = nombreJugador;
		this.valor = valor;
	}

	private void setCodigoIdentificatorio(String seleccion, Integer numFigu) {
		this.seleccion = seleccion;
		this.numFigu = numFigu;

	}

	public String getSeleccion() {
		return seleccion;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public Integer getNumFigu() {
		return numFigu;
	}

	public void setNumFigu(Integer numFigu) {
		this.numFigu = numFigu;
	}

	public char getLetraGrupo() {
		return letraGrupo;
	}

	public void setLetraGrupo(char letraGrupo) {
		this.letraGrupo = letraGrupo;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numFigu, seleccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(numFigu, other.numFigu) && Objects.equals(seleccion, other.seleccion);
	}

	@Override
	public int compareTo(Figurita o) {
		int resultado = this.letraGrupo.compareTo(o.getLetraGrupo());
		if (resultado == 0) { //significa que es igual
			resultado = this.seleccion.compareTo(o.getSeleccion());
			if (resultado == 0) {
				resultado = this.numFigu.compareTo(o.getNumFigu());
			}
		}
		return resultado;
	}

}
