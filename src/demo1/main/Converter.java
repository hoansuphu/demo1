package demo1.main;

public abstract class Converter {

	private float rate = 0;
	
	public Converter(float rate){
		this.rate = rate;
	}
	
	public abstract float convert(int amount);

	public float getRate() {
		return rate;
	}
}
