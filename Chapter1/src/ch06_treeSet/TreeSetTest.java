package ch06_treeSet;

import java.util.HashSet;

public class TreeSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김유신"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
		
	}
	
	
}
