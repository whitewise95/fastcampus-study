package ch12_파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 
 * FileInputStream 는 기존에 문자를 읽을 수 없지만 InputStreamReader라는 보조 Stream 으로 문자열을 읽을 수 있다
 * 사용법은  InputStreamReader() 매개변수로 FileInputStream() 를 주면 된다.
 * 
 * 예제는 없지만. OutPutStreamReader()도 같은 원리이다.
 * 
 * */
public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("inputStreamReaderTest.txt"));
			int i = 0;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
