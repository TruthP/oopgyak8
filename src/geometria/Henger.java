package geometria;

public class Henger extends Hasab {
	private double sugar;

	
	public Henger(double magassag, double sugar){
		super(magassag);
		this.sugar =sugar;
	}
	@Override
	public double alapterulet(){
		
		return sugar * sugar * Math.PI;
	}
	
	@Override
	public String toString(){
		return "Sugar: " + sugar + ", Magassag: " + getMagassag();
	}

}
