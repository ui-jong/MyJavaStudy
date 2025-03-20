package simpleCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class RunHere {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		sc.close();
		
		StringParser parse = new StringParser();	
		Calculator cal = new Calculator();
		
		System.out.println(Arrays.deepToString(parse.stringParse(str)));
		System.out.println(cal.detector(parse.stringParse(str)));
				
	}

}
