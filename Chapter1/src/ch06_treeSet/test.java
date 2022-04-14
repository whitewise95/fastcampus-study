package ch06_treeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		TreeSet<Member> test = new TreeSet<>();
		
		test.add(new Member(1,"김유신"));
		test.add(new Member(4,"김유신4"));
		test.add(new Member(3,"김유신3"));
		test.add(new Member(2,"김유신2"));
		
		Iterator<Member> iter = test.iterator();
		
		
		while(iter.hasNext()) {
			Member print = iter.next();
			System.out.println(print);
		}
		
	}

}
