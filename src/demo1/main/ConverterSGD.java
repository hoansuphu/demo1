package demo1.main;

public class ConverterSGD extends Converter {

	public ConverterSGD(float rate) {
		super(rate);
	}

	@Override
	public double convert(int amount) {
		
		return this.getRate() * amount - 1;
	}
}
