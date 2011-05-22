package fr.arpinum.katas;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestsNombreRomain {

	@Test
	public void peutObtenir1() {
		valideNombre(1, "I");
	}

	@Test
	public void peutObtenir2() {
		valideNombre(2, "II");
	}

	@Test
	public void peutObtenir3() {
		valideNombre(3, "III");
	}

	@Test
	public void peutObtenir4() {
		valideNombre(4, "IV");
	}

	@Test
	public void peutObtenir5() {
		valideNombre(5, "V");
	}

	@Test
	public void peutObtenir6() {
		valideNombre(6, "VI");
	}

	@Test
	public void peutObtenir9() {
		valideNombre(9, "IX");
	}

	@Test
	public void peutObtenir10() {
		valideNombre(10, "X");
	}

	@Test
	public void peutObtenir40() {
		valideNombre(40, "XL");
	}

	@Test
	public void peutObtenir50() {
		valideNombre(50, "L");
	}

	@Test
	public void peutObtenir90() {
		valideNombre(90, "XC");
	}

	@Test
	public void peutObtenir100() {
		valideNombre(100, "C");
	}

	@Test
	public void peutObtenir400() {
		valideNombre(400, "CD");
	}

	@Test
	public void peutObtenir500() {
		valideNombre(500, "D");
	}

	@Test
	public void peutObtenir900() {
		valideNombre(900, "CM");
	}

	@Test
	public void peutObtenir1000() {
		valideNombre(1000, "M");
	}

	private void valideNombre(final int arabe, final String romain) {
		final NombreRomain nombreRomain = new NombreRomain(arabe);

		final String nombre = nombreRomain.toString();

		assertThat(nombre, is(romain));
	}
}
