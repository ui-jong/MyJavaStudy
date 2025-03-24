package stringCalculatorV2;

public class OperatorImpl implements Operator {

	@Override
	public double add(double num1, double num2) {
			
		return num1 + num2;
	}
	
	@Override
	public double mul(double num1, double num2) {
		
		return num1 * num2;
		
	}
	
	@Override
	public double minus(double num1, double num2) {
		
		return num1 - num2;
	}
	
	@Override
	public double div(double num1, double num2) {
		
		return num1 / num2;
	}
	
	

}
