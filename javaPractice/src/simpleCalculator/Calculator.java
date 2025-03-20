package simpleCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		sc.close();
		
		StringParser parse = new StringParser();	
		AutoDetector dtc = new AutoDetector();
		
		System.out.println(Arrays.deepToString(parse.stringParse(str)));
		System.out.println(dtc.detector(parse.stringParse(str)));
				
	}

}
