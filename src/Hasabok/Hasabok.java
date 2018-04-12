package Hasabok;

import geometria.*;

public class Hasabok {
	
	Hasab[] tomb;
	
	public Hasabok(int meret) {
		tomb = new Hasab[meret];
	}

	public void setHasab(int index, Hasab hasab) {
		tomb[index] = hasab;
	}
	
	public int meret() {
		return tomb.length;
}
	public Hasab getHasab(int index) {
		if (index >= 0 && index < meret()) {
			return tomb[index];
		} else
			return null;
	}

	public int nemNullHasab() {
		int darab = 0;
		
		for (int i = 0; i < meret(); i++)
			if (tomb[i] != null)
				darab++;

		return darab;
	}
	public double atlTerfogat() {
		double osszeg = 0;
		int darab = 0;
		
		for (int i = 0; i < meret(); i++) {
			if (tomb[i] != null) {
				osszeg += tomb[i].terfogat();
				darab++;
			}
		}
		
		if (darab != 0) {
			return osszeg/darab;
		} else 
			return 0;
		
	}
	
	public int hengerekSzama() {
		int darab = 0;
		
		for (int i = 0; i < meret(); i++) {
			if (tomb[i] instanceof Henger) {
				darab++;
			}
		}
		
		return darab;
	}
}