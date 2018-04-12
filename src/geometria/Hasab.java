package geometria;



public abstract class Hasab {

	private double magassag;
	
	public Hasab(double magassag){
		this.magassag = magassag;
	}
	
	public double getMagassag(){
		return magassag;
	}
	
	public abstract double alapterulet();
	
	public double terfogat(){
		
		return alapterulet()*magassag;
	

	}
	public boolean nagyobbTerfogatuMint(Hasab masikHasab){
		return terfogat()>masikHasab.terfogat();
	}

}

