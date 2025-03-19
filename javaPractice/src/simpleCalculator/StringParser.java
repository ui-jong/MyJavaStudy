package simpleCalculator;

import java.util.ArrayList;

public class StringParser {
	
	public ArrayList<String> stringParse(String input) {
		
		
		ArrayList<String> parsedData = new ArrayList<>();
		
		String[] splited = input.replaceAll(" ", "").split("[\\+\\-\\*\\/]");
		
		for (String token : splited ) {
			parsedData.add(token);
		}
		
		return parsedData;
		
	}

}
