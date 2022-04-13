package ch03;


/*
 * concat ����ؼ� StringBuilder �� StringBuffer �� ����ϸ� �����޸��ּҿ��� ���� �ٲ�
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
