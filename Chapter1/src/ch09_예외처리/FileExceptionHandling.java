package ch09_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * catch를 사용하면 try에서 오류가 있어도 프로그램이 종류되지 않고 System.out.println("여기도 수행됩니다."); 까지 수행한다
 * finally 는 무슨일이 있어도 실행이 된다. 보통 close()를 할 때 사용
 * 
 * */
public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}
}
