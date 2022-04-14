package ch12_파일입출력;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * FileInputStream 과 FileOutputStream 으로도 zip을 copy할 수 있지만   / 28초
 * BufferedInputStream 와 BufferedOutputStream 를 사용하면 더 빨리 할 수 있었다.  //0.5
 * 
 * */

public class BufferedTest {

	public static void main(String[] args) throws IOException {
		
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("FastCampus-master.zip"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("FastCamus-master-copy.zip"))
		){
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
