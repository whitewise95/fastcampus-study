package ch08_문제;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 여행사에 패키지 여행 상품이 있습니다.
 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원입니다.
 * 고객명단을 관리하여 스트림을 이용해 구현해봅시다.
 * 
 * 
 * 이순신 , 48, 100
 * 김유신 , 20, 50
 * 홍길동 , 15, 50
 *  
 *  
 *  출력 
 *  1. 고객의 명단을 출력
 *  2. 여행의 총 비용을 계산
 *  3. 고객 중 20세 이상인 사람의 이름을 정렬 하여 출력
 * */
class Member<T> implements Comparator<Member>{
	
	private String name;
	private int age;
	private	int price;
	
	public Member(){
	}
	
	public Member(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compare(Member o1, Member o2) {
		if(o1.getName().compareTo(o2.getName()) > 0){
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}



	
}

public class Stream_문제풀이1 {
	
	public static void main(String[] args) {
		
		List<Member> memberList = new ArrayList();
		
		memberList.add(new Member("이순신", 48, 100));
		memberList.add(new Member("김유신", 20, 100));
		memberList.add(new Member("홍길동", 15, 50));
		
		System.out.print("여행자 명단 : " );
		List<Member> filteringMember = memberList.stream().filter(member -> {
			System.out.print(member.getName() + ", ");
			return member.getAge() >= 20; 
		})	
		.collect(Collectors.toList());

		System.out.println();
		System.out.println("가격 총합 : " +memberList.stream().mapToInt(s -> s.getPrice()).sum());
		
		System.out.print("고객 중 20세 이상인 사람의 이름을 정렬 하여 출력 : ");
		filteringMember.stream().map(member -> member.getName()).sorted().forEach(s -> System.out.print(s+","));
		
	}

}
