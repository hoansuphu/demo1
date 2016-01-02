package demo1.main;

public class Main1 {

	public static void main(String[] args) {

		System.out.println("hello world");
		
		System.out.println("Sum 02 number 1 & 2: " + Calculator.sum(1, 2));
		System.out.println("Subtract 1 from 2: " + Calculator.deduct(1, 2));
		
		Converter sgdConverter = new ConverterSGD(15000);
		System.out.println("1000 SGD equals to: " + sgdConverter.convert(1000));
	}

}
