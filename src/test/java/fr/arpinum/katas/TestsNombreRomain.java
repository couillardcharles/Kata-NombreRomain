package fr.arpinum.katas;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestsNombreRomain {

	@Test
	public void peutObtenirLesNombres() {
		valideNombre(1, "I");
		valideNombre(2, "II");
		valideNombre(4, "IV");
		valideNombre(5, "V");
		valideNombre(6, "VI");
		valideNombre(9, "IX");
		valideNombre(10, "X");
		valideNombre(40, "XL");
		valideNombre(50, "L");
		valideNombre(90, "XC");
		valideNombre(100, "C");
		valideNombre(400, "CD");
		valideNombre(500, "D");
		valideNombre(900, "CM");
		valideNombre(1000, "M");
	}

	@Test
	public void peutObtenirLeNombreLePlusLong() {
		valideNombre(4888, "MMMMDCCCLXXXVIII");
	}

	private void valideNombre(final int arabe, final String romain) {
		final NombreRomain nombreRomain = new NombreRomain(arabe);

		final String nombre = nombreRomain.toString();

		assertThat(nombre, is(romain));
	}
}
