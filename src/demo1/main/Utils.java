package demo1.main;

public class Utils {

	public static Number sum(Number n1, Number n2){
		return n1.doubleValue() + n2.doubleValue();
	}
	
	public static Number deduct(Number value, Number fromValue){
		return fromValue.doubleValue() - value.doubleValue();
	}
}
