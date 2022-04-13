package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;


//  stream 의 reduce 와 BinaryOperator를 구현한 메소드
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String t, String u) {
		if(t.getBytes().length >= u.getBytes().length) {
			return t;
		} else {
			return u;
		}
	}
	
}


public class Reduce {

	public static void main(String[] args) {
		String[] text = {"일","둘둘","셋셋셋","넷넷넷넷넷투","다섯번째임"};
		
		String topText = Arrays.stream(text).reduce("",(s1,s2)-> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
			
		});

		System.out.println(topText);
		
		String topText2= Arrays.stream(text).reduce(new CompareString()).get();
		
		System.out.println(topText);

	}

}
