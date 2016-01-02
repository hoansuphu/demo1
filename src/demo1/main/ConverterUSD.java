package demo1.main;

public class ConverterUSD extends Converter {

	public ConverterUSD(float rate) {
		super(rate);
		System.out.println("Init USD Converter...");
	}

	@Override
	public double convert(int amount) {
		
		return this.getRate() * amount - 2;
	}
}
