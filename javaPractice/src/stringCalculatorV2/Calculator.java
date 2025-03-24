package stringCalculatorV2;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
	
	//문자열이 숫자인지 검증하기
	public boolean isnumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//연산자 순위 바꿔주기 위한 메서드
	public void operatorChange() {
		//어떻게 하지
		//1 우선순위 연산자 찾기
		//2 우선순위 연산자를 반환
		//3 반환한 연산자를 stack에 넣어주기
		//4 근데 이걸 반복해야 함...
	}
	
	
	//계산하기
	public void calculate(ArrayList<String> token) {
		
		OperatorImpl calc = new OperatorImpl();
			
		//stack사용해 후순위계산식 만들기
		Stack<String>numStack = new Stack<>();
		Stack<String>oprStack = new Stack<>();
		
		//일단 토큰에서 하나씩 꺼내서 담는다
		for(String tk : token) {
			if (isnumeric(tk)) { //문자열이 숫자면 stack에 넣어준다
				numStack.push(tk);
			} else { //이제 연산자 만날 시 순위를 바꿔 넣어줘야 함
				
			}
		} 
		
		
					
	}

}
