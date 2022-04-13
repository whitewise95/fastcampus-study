package ch04_array;

//Queue ����
public class ArrayQueue extends LinkedList{
	
	int cnt = 0;
	ListNode front;
	ListNode rear;

	
	void enqueue(String data) {
		ListNode newNode;
		if(cnt == 0) {
			newNode = lastInsert(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = lastInsert(data);
			rear = newNode;
		}
		cnt ++;
		ListNode temp = front;
		for (int i = 0; i < cnt; i++) {
			System.out.print(temp.data+ " , ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void deQueue() {
		if(cnt == 0 ) {
			System.out.println("empty");
			return;
		}
		
		front = front.next;
		if(front == null) {
			rear = null;
		} 
		cnt--;
		rear = new ListNode(front.data, front);
		ListNode temp = front;
		for (int i = 0; i < cnt; i++) {
			System.out.print(temp.data+ " , ");
			temp = temp.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		ArrayQueue test = new ArrayQueue();
		test.enqueue("������1");
		test.enqueue("������2");
		test.enqueue("������3");
		test.deQueue();
		test.enqueue("������4");
		test.enqueue("������4");
		test.enqueue("������4");
		test.enqueue("������4");
		test.enqueue("������4");
		test.deQueue();
		test.deQueue();
		test.deQueue();
		test.deQueue();
		
	}

}
