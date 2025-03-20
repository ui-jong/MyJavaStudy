package simpleCalculator;

import java.util.ArrayList;

public class StringParser {
	
	public String[][] stringParse(String input) {
		
		input = input.replaceAll(" ", "");
		
		String[] parsedNum = input.split("[\\+\\-\\*\\/]");
		String[] parsedOPR = input.split("\\d+");
		
		ArrayList<String> operators = new ArrayList<>(); 

		for(String opr : parsedOPR) {
			operators.add(opr);
		}
		
		operators.remove(0);
		
		String[] opr = operators.toArray(new String[0]);

			
		String[][] token = {parsedNum,opr};
	
		return token;
		
	}

}
