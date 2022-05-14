
public class JocDeFotbal {

	public static void main(String[] args) {

		Joc joc1 = new Joc("Romania", "Spania");
		Joc joc2 = new Joc("Romania", "Anglia");
		
		joc1.simuleaza();
		joc2.simuleaza();
		
		System.out.println("Rezultat joc1: " + joc1.toString());
		System.out.println("Rezultat joc2: " + joc1.toString());

	}

}
