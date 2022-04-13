package ch09_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * throws FileNotFoundException, ClassNotFoundException 예외처리를 미루었을 때 
 * loadClass() 메소드를 사용하는 곳에서 처리해주는역활을 한다.
 * loadClass() 메소드를 사용하는 곳에서도 미룰 수 있지만 정상적인 코드는 아니다.
 * 
 * */
public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 발생
		Class c = Class.forName(className);  //ClassNotFoundException 발생
		return c;
	}

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}