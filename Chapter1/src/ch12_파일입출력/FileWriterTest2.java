package ch12_파일입출력;

import java.io.FileWriter;
import java.io.IOException;


/*
 * FileWriter 문자열이나 char 등 가능
 * 
 * */
public class FileWriterTest2 {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("fileWritertest.txt")) {
			
			fw.write("테스트");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
