package demo1.main;

public class ConverterSGD extends Converter {

	public ConverterSGD(float rate) {
		super(rate);
		System.out.println("Init SGD Converter...");
	}

	@Override
	public double convert(int amount) {
		
		return this.getRate() * amount - 1;
	}
}
