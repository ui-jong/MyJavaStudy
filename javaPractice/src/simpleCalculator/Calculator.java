package simpleCalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public String calculate(String[][] token) {
		//5+6*6/6+5 또는 
		//곱하기가 섞여있을때 어떻게 할까?
			
		List<String> number = new ArrayList<>();
		List<String> operator = new ArrayList<>();
		
		OperatorImpl calc = new OperatorImpl();
		
		
		for(int i = 0 ; i < token[0].length ; i++) {
			number.add(token[0][i]);
		} //이러면 5,6,6,6,5 인덱스 0,1,2,3
		
		for(int i = 0 ; i < token[1].length ; i++) {
			operator.add(token[1][i]);
		} //이러면 +,*,/,+ 하지만 계산은 6*6먼저 해야 함.. 인덱스를 뽑을까?
		
		
		//곱하기나 나눗셈 먼저 계산
		for(int i = 0 ; i < operator.size() ; i++) {
			if(operator.get(i).equals("*") || operator.get(i).equals("/")) {
				double num1 = Double.parseDouble(number.get(i));
				double num2 = Double.parseDouble(number.get(i+1));
				double res = 0;

				switch (operator.get(i)) {
					case "*": res = calc.mul(num1, num2); // [5,36,6,6,5]
							 break;
					case "/": res = calc.div(num1, num2);
							 break;

				}
				
		     number.set(i, Double.toString(res)); // [5,36,6,6,5]
			 number.remove(i+1);// [5,36,6,5]
		     operator.remove(i); // [+,*,/,+] 에서 [+,/,+]
		     i--; //remove로 인덱스 작아짐
			} 
		} //반복문 끝날시 [5,1,5] , [+,+]
		
		if(operator.size() > 0) { //곱셉 돌리고 연산자 남아 있으면
			
			for(int i = 0 ; i < operator.size() ; i++) {
				double num1 = Double.parseDouble(number.get(i));
				double num2 = Double.parseDouble(number.get(i+1));
				double res = 0;
				
				switch (operator.get(i)) {
				case "+": res = calc.add(num1, num2); // [6,1,5]
						 break;
				case "-": res = calc.minus(num1, num2);
						 break;
			    }
				
			     number.set(i, Double.toString(res));
				 number.remove(i+1);// [6,5]
			     operator.remove(i); // [+,+] 에서 [+]
			     i--; //remove로 인데스 작아짐
			}//반복문 종료시 [11] , []
			
		}

		
		return number.get(0);
					
	}

}
