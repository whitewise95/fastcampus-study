package ch4;

public class LinkedList {
	
	private ListNode head;  
	private int cnt = 0;
	
	public LinkedList() {
		head = null;
	}
	
	
	public void firstInsert(String data) {
		ListNode newNode = new ListNode(data); 
		
		if (head == null ) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		cnt++;
		print();
	}
	
	public ListNode lastInsert(String data) {
		
		ListNode newNode = new ListNode(data); 
		
		if (head == null ) {
			head = newNode;
		} else {
			
			ListNode tempNode = head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			
		}
		cnt++;
//		print();
		return head;
	}
	
	public void middleInsert(int index, String data) {
		
		ListNode newNode = new ListNode(data); 
		
		if(index > cnt || index < 0 ) {
			return;
		}
		
		if (head == null ) {
			head = newNode;
		} else {
			ListNode tempNode = head;
			ListNode preNode = new ListNode();
			
			for (int i = 0 ; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			
			newNode.next = preNode.next;
			preNode.next = newNode;
			
			
		}
		cnt++;
		print();
	}
	
	public void remove(int index) {
		
		ListNode tempNode = head;
		ListNode preNode = new ListNode();
		
		
		for (int i = 0; i < index; i++) {
			preNode = tempNode;
			tempNode = tempNode.next;
		}
		
		preNode.next = tempNode.next;
		
		cnt--;
		print();
	}
	
	public void print() {
		ListNode tempNode = head;
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(tempNode.data + " , ");
			tempNode = tempNode.next;
		}
		System.out.println();
			
	
	}
	
	
	
public class ListNode {
		
		public String data;
		public ListNode next;
		

		public ListNode() {
		}
		
		public ListNode(String data) {
			this.data = data;
			this.next = null;
		}
		
		public ListNode(String data, ListNode next) {
			this.data = data;
			this.next = next;
		}
		
	}
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.firstInsert("ssss");
		link.firstInsert("ssss1");
		link.firstInsert("ssss2");
		link.lastInsert("마지막데이터1");
		link.lastInsert("마지막데이터2");
		link.lastInsert("마지막데이터3");
		link.middleInsert(1, "추가된데이터");
		link.middleInsert(1, "추가된데이터2");
		
		
		link.remove(4);
}
	
	
}
