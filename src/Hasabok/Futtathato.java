package Hasabok;

import geometria.*;

public class Futtathato {

	public static void main(String[] args) {
		Hasabok hasabtomb = new Hasabok(5);

		Hasab henger1 = new Henger(1, 2);
		Hasab henger2 = new Henger(3, 4);
		Hasab teglatest = new Teglatest(1, 2, 3);

	
		hasabtomb.setHasab(0, henger1);
		hasabtomb.setHasab(1, henger2);
		hasabtomb.setHasab(2, teglatest);

		System.out.println("Hasabok adatai:");
		for (int i = 0; i < hasabtomb.meret(); i++) {	
			System.out.println(hasabtomb.getHasab(i));
		}

		System.out.printf("Hasabok atlagos terfogata: %.2f\n", hasabtomb.atlTerfogat());
		System.out.println("Hengerek szama: " + hasabtomb.hengerekSzama());
	}

}