package ch4;

//Queue 구현
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
		test.enqueue("데이터1");
		test.enqueue("데이터2");
		test.enqueue("데이터3");
		test.deQueue();
		test.enqueue("데이터4");
		test.enqueue("데이터4");
		test.enqueue("데이터4");
		test.enqueue("데이터4");
		test.enqueue("데이터4");
		test.deQueue();
		test.deQueue();
		test.deQueue();
		test.deQueue();
		
	}

}
