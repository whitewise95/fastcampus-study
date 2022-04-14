package ch12_파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * FileInputStream 으로 영문으로 된 txt를 읽을 수 있다.
 * 1byte 씩 읽으며 char로 변환해서 읽으면 된다.
 * 
 * */
public class FileInputStreamTest {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("read.txt");
			
			int i;
			
			try {
				
				while((i = fis.read()) != -1) {
					System.out.print((char)i);
				}
				
			} catch (IOException e) {e.printStackTrace();}
		} catch (FileNotFoundException e) {e.printStackTrace();}
		
	}

}
