package fr.arpinum.katas;

public class NombreRomain {

	private final int nombre;

	public NombreRomain(final int nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		String résultat = "";
		int temp = nombre;
		for (final Equivalence equivalence : Equivalence.values()) {
			final int occurence = temp / equivalence.arabe();
			temp -= occurence * equivalence.arabe();
			for (int i = 0; i < occurence; i++) {
				résultat += equivalence.romain();
			}
		}
		return résultat;
	}

	public enum Equivalence {
		Mille(1000, "M"), NeufCent(900, "CM"), CinqCent(500, "D"), QuatreCent(400, "CD"), Cent(100, "C"), QuatreVingtDix(
				90, "XC"), Cinquante(50, "L"), Quarante(40, "XL"), Dix(10, "X"), Neuf(9, "IX"), Cinq(5, "V"), Quatre(
				4, "IV"), Un(1, "I");

		private Equivalence(final int nombreArabe, final String nombreRomain) {
			arabe = nombreArabe;
			romain = nombreRomain;
		}

		int arabe() {
			return arabe;
		}

		String romain() {
			return romain;
		}

		private String romain;
		private int arabe;
	}
}
