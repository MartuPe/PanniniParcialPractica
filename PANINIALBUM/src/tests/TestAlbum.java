package tests;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

import dominio.Administrador;
import dominio.CodigoExistenteException;
import dominio.Figurita;
import dominio.UsuFinal;
import dominio.Usuario;

public class TestAlbum {

	@Test
	public void queSePuedaCrearFigurita() {
		Figurita figu = new Figurita("Argentina", 9, 'A', "Martupe", 98000.0);

		Integer numFiguEsperado = 9;

		assertEquals(numFiguEsperado, figu.getNumFigu());
		assertEquals("Argentina", figu.getSeleccion());

	}

	@Test
	public void queSePuedaCrearUnAdministrador() {
		Usuario admin = new Administrador("Martucapa");

		assertNotNull(admin);
	}

	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		Usuario usuFinal = new UsuFinal("Martucapa");

		assertNotNull(usuFinal);
	}

	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() throws CodigoExistenteException {

		Usuario admin = new Administrador("Martucapa");
		Figurita figu = new Figurita("Argentina", 9, 'A', "Martupe", 98000.0);

		admin.agregarFigurita(figu);

		assertTrue(((Administrador) admin).getFiguritasDadasDeAlta().contains(figu));
	}

	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() throws CodigoExistenteException {
		Usuario usuFinal = new UsuFinal("Martucapa");
		Figurita figu = new Figurita("Argentina", 9, 'A', "Martupe", 98000.0);

		usuFinal.agregarFigurita(figu);

		assertTrue(((UsuFinal) usuFinal).getFiguritasEnStock().contains(figu));

	}

	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadas() throws CodigoExistenteException {
		Usuario usuFinal = new UsuFinal("Martucapa");
		Figurita figu = new Figurita("Argentina", 9, 'B', "Martupe", 98000.0);
		Figurita figu2 = new Figurita("Belgica", 25, 'A', "Nico", 98000.0);
		Figurita figu3 = new Figurita("Alemania", 49, 'C', "Pepe", 98000.0);
		Figurita figu4 = new Figurita("Argentina", 19, 'D', "Messi", 98000.0);
		Figurita figu5 = new Figurita("Croacia", 32, 'B', "Pike", 98000.0);
		Figurita figu6 = new Figurita("Argentina", 10, 'A', "Ronaldo", 98000.0);

		usuFinal.agregarFigurita(figu);
		usuFinal.agregarFigurita(figu2);
		usuFinal.agregarFigurita(figu3);
		usuFinal.agregarFigurita(figu4);
		usuFinal.agregarFigurita(figu5);
		usuFinal.agregarFigurita(figu6);

		TreeSet<Figurita> figusOrdenadas= (TreeSet<Figurita>) ((UsuFinal) usuFinal).getFiguritasEnStock();
		
		assertEquals(figusOrdenadas.first(), figu6); 
		assertEquals(figusOrdenadas.last(), figu4);
		
	}

//  @Test
//  public void  queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() {
//      fail("Not yet implemented");
//  }
//
//  @Test
//  public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() {
//      fail("Not yet implemented");
//  }
//  @Test
//  public void queUnUsuarioFinalPuedaPegarUnaFigurita() {
//      fail("Not yet implemented");
//  }
//
//  @Test
//  public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() {
//      fail("Not yet implemented");
//  }
//
//  @Test
//  public void  queSePuedaRealizarElIntercambioDeFiguritasEntreDosUsuariosFinales() {
//      fail("Not yet implemented");
//  }
//
//  @Test
//  public void  queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueNoLaTenga() {
//      fail("Not yet implemented");
//  }
//  @Test
//  public void  queNoSePuedaIntercambiarUnaFiguritaDeUnUsuarioQueYaLaHayaPegado() {
//      fail("Not yet implemented");
//  }
//
}
