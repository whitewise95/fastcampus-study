package ch3;


/*
 * concat 대신해서 StringBuilder 나 StringBuffer 를 사용하면 기존메모리주소에서 값만 바뀜
 * 
 * */
public class StringBiuderTest {

	public static void main(String[] args) {
		
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		
		System.out.println(System.identityHashCode(builder)); // 705927765
		
		builder.append(android);
		
		System.out.println(System.identityHashCode(builder));  // 705927765
		
		
		String test = builder.toString();
		System.out.println(test);
		
	}

}
