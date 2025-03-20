package simpleCalculator;

import java.util.ArrayList;

public class Calculates implements Calculate {

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
