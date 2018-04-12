package algeometria;

import geometria.Henger;
import geometria.Teglatest;

public class Futtathato {

	
	public static void main(String[] args) {
		Henger henger = new Henger(8,10);
		
		System.out.println("Henger adatok: " +henger);
		System.out.println("Terfogata: " +henger.terfogat());
		
		Teglatest teglatest = new Teglatest(2, 3, 5);

		System.out.println("Téglatest adatok: " + teglatest);
		System.out.println("A téglatest térfogata:\n" + teglatest.terfogat());

		System.out.println("henger.nagyobbTerfogatuMint(teglatest)");
		System.out.println(henger.nagyobbTerfogatuMint(teglatest));
		System.out.println("teglatest.nagyobbTerfogatuMint(henger)");
		System.out.println(teglatest.nagyobbTerfogatuMint(henger));

		if (henger.nagyobbTerfogatuMint(teglatest)) {
			System.out.println("A henger terfogata nagyobb.");
		} else if (teglatest.nagyobbTerfogatuMint(henger)) {
			System.out.println("A teglatest terfogata nagyobb");
		} else {
			System.out.println("A ket test egyforma terfogatu");
}
		
		
	}

}
