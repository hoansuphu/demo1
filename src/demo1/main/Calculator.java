package demo1.main;

public class Calculator {

	public static Number sum(Number n1, Number n2){
		return n1.doubleValue() + n2.doubleValue();
	}
	
	public static Number deduct(Number value, Number fromValue){
		return fromValue.doubleValue() - value.doubleValue();
	}
	
	public static Number multiply(Number n1, Number n2){
		return n1.doubleValue() * n2.doubleValue();
	}
}
