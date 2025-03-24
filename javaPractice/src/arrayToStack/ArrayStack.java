package arrayToStack;

public class ArrayStack {
	
	int top = -1;
	final Object[] stack; //최상위 타입
	
	//===========================================================
    public ArrayStack(int size) {
        this.stack = new Object[size]; // 생성자에서 초기화 (반드시 필요!)
    }
	
    //============================================================
    
	public boolean isEmpty() {
		return -1 == top; //top이 -1이면 true반환
	}

	//==========================================
	
	public boolean isFull() {
		return stack.length - 1 == top;
	}
	
	//==========================================
	
	
	public void push(Object data) {
		if (isFull()) {
			throw new RuntimeException("full");
		} else {
			stack[++top] = data;
		}
	}
	
	//==========================================
	
	public Object pop(Object data) {
		if(isEmpty()) {
			throw new RuntimeException("empty");
		} else {
			Object tempData = stack[top];
			stack[top--] = null;
			return tempData;
		}
		
	}
	
	//==============================================
	
	public Object peek() {
		if(isEmpty()) {
			return null;
		} else {
			return stack[top];
		}
			
	}
	

}
