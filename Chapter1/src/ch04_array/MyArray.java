package ch04_array;

// ArrayList ����
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
			System.out.println("index�� ��Ȯ���� �ʽ��ϴ�. : index = " + index);
			return;
		}
		if (index > 10) {
			System.out.println("index�� �迭�� ������� Ů�ϴ�. : index = " + index);
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
			System.out.println("index�� ��Ȯ���� �ʽ��ϴ�. : index = " + index);
			return;
		}
		if (index > 10) {
			System.out.println("index�� �迭�� ������� Ů�ϴ�. : index = " + index);
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
			System.out.println("�迭�� ���� �����ϴ�.");
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
