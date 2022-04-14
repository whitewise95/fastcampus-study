package ch12_파일입출력;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * FileOutputStream 는 파일이 없다면 생성을 해준다.
 * write() 함수를 사용해 작성할 수 있다.
 * int 나 char 데이터 타입만 가능하다.
 * FileOutputStream 또 byte[]에 담아서 write()메소드로 한번에 쓰기가 가능하다.
 * 
 * */
public class FileOutPutSteamTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		try {
			FileOutputStream fos = new FileOutputStream("write.txt");
			fos.write('a');
			fos.write(66);
			fos.write(67);
			fos.write(68);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
