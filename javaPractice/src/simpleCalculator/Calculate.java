package simpleCalculator;

import java.util.ArrayList;

public interface Calculate {
	
	public double add(ArrayList<String> parsedData);
	public double sub(ArrayList<String> parsedData);
	public double mul(ArrayList<String> parsedData);
	public double minus(ArrayList<String> parsedData);
	
}
