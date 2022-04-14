package ch12_파일입출력;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
 * FileReader는 문자단위를 입출력할 수 있는 클래스이다.
 * 
 * */
public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("fileReaderTest1.txt");
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
