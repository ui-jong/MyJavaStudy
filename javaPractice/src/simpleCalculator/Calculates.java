package simpleCalculator;

import java.util.ArrayList;

public class Calculates implements Calculate {

	@Override
	public double add(ArrayList<String> parsedData) {
		
		double num1 =  Double.parseDouble(parsedData.get(0));
		double num2 = Double.parseDouble(parsedData.get(2));
		
		return num1 + num2;
	}
	
	@Override
	public double mul(ArrayList<String> parsedData) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double minus(ArrayList<String> parsedData) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double sub(ArrayList<String> parsedData) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
