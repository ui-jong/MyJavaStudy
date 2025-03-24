package stringCalculatorV2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {
	
	ArrayList<String>token = new ArrayList<>();
	
			
	public ArrayList<String> stringParse(String input) {
				
		input = input.replaceAll(" ", "");
		
        Pattern pattern = Pattern.compile("\\d+|[+\\-*/()]");
        Matcher inputMtcher = pattern.matcher(input);
        
        while (inputMtcher.find()) {
            token.add(inputMtcher.group());
        }
        			
		return token;
		
	}

}
