package ch4;

// ArrayList 구현
public class MyArray {
	
	int[] intArr = new int[10];
	int cnt = 0;
	
	public MyArray() {
	}


	public MyArray(int cnt) {
		intArr = new int[cnt];
		cnt = 0;
	}


	public void insert(int index, int value) {
		
		if (index < 0 || index > cnt) {
			System.out.println("index가 정확하지 않습니다. : index = " + index);
			return;
		}
		if (index > 10) {
			System.out.println("index가 배열의 사이즈보다 큽니다. : index = " + index);
			return;
		}
		
		for (int i = index; i < cnt+1; i++) {
			intArr[i+1] = intArr[i];
		}
		
		intArr[index] = value;
		cnt++;
		print();
	}
	
	
	public void remove(int index) {
		if (index < 0 || index > cnt) {
			System.out.println("index가 정확하지 않습니다. : index = " + index);
			return;
		}
		if (index > 10) {
			System.out.println("index가 배열의 사이즈보다 큽니다. : index = " + index);
			return;
		}
		
		for (int i = index; i < cnt-1; i++) {
			intArr[i] = intArr[i+1];
		}
		cnt--;
		print();
	}
	
	
	void print() {
		if (cnt == 0) {
			System.out.println("배열에 값이 없습니다.");
			return;
		}
		
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(intArr[i]+ ",");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		MyArray ss = new MyArray();
		
		
		ss.insert(0, 1);
		ss.insert(1, 2);
		ss.insert(2, 3);
		
		ss.remove(1);
		
		
	}
}
