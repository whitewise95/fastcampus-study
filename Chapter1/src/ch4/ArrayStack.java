package ch4;

//stack ±¸Çö
public class ArrayStack {

	int top = 0;
	MyArray stack;
	
	ArrayStack() {
		top = 0;
		stack = new MyArray();
		
	}
	ArrayStack(int top) {
		top = 0;
		stack = new MyArray(top);
	}
	
	void push(int data) {
		if(top == 11) {
			System.out.println("full");
			return;
		}
		stack.insert(top, data);
		top++;
	}
	
	void pop() {
		if(top == 0) {
			System.out.println("empty");
			return;
		}
		stack.remove(--top);
	}

	
	
	
	
	public static void main(String[] args) {
		
		ArrayStack t = new ArrayStack();
		
		t.push(1);
		t.push(1);
		t.push(1);
		t.push(1);
		
		t.pop();
		t.pop();
		t.pop();
	}

}
