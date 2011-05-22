package fr.arpinum.katas;

public class NombreRomain {

	public NombreRomain(final int nombre) {

		this.nombre = nombre;

	}

	@Override
	public String toString() {
		String résultat = "";
		int temp = nombre;
		for (final Equivalence equivalence : equivalences) {
			final int occurence = temp / equivalence.arabe();
			temp -= occurence * equivalence.arabe();
			for (int i = 0; i < occurence; i++) {
				résultat += equivalence.romain();
			}
		}
		return résultat;
	}

	private final int nombre;
	private final Equivalence[] equivalences = new Equivalence[] { new Equivalence(1000, "M"),
			new Equivalence(900, "CM"), new Equivalence(500, "D"), new Equivalence(400, "CD"),
			new Equivalence(100, "C"), new Equivalence(90, "XC"), new Equivalence(50, "L"),
			new Equivalence(40, "XL"), new Equivalence(10, "X"), new Equivalence(9, "IX"), new Equivalence(5, "V"),
			new Equivalence(4, "IV"), new Equivalence(1, "I") };

	public class Equivalence {

		public Equivalence(final int nombreArabe, final String nombreRomain) {
			arabe = nombreArabe;
			romain = nombreRomain;
		}

		String romain() {
			return romain;
		}

		int arabe() {
			return arabe;
		}

		private final String romain;
		private final int arabe;
	}

}
