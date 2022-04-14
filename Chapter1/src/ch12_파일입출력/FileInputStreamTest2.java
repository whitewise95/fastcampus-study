package ch12_파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * FileInputStream 의 read() 함수에 byte를 정해서 매개변수로 넣어주면 
 * 한번에 그 byte까지 읽게 된다.
 * byte[10]으로 설정했다면  10byte를 담기에 10번 씩 읽고 나중에 6byte만 읽고 4byte는 초기화가 안되기에 
 * for문으로 읽은 byte수를 반환된 i만큼 돌리면 읽어드린 데이터만 볼 수 있다.
 * 
 * */
public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		
		try {
			FileInputStream fis = new FileInputStream("read2.txt");
			byte[] bs = new byte[10];
			
			int i;
			
			while((i = fis.read(bs) ) != -1) {
				
				for(int j=0; j < i; j++) {
					
					System.out.print((char)bs[j] + " ");
					
				}
				
				System.out.print(i+"byt 읽음");
				System.out.println();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
