package ch12_파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable{
	private String name;
	private String job;
	
	
	
	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", job=" + job + "]";
	}

	
}

/*
 *  ObjectOutputStream 으로 fr매개변수로 인스턴스를 생성한다.
 *  writeObject() 메소드에 자료형객체를 넣어 저장을 할 수 있다. 
 *  자료형객체의 클래스는 Serializable을 구현 해야한다.
 *  ObjectInputStream() 으로 다시 읽을 수 있다.
 *  
 *  만약 변수를 제외하고 싶다면 transient private String 변수명 으로 transient 사용하면된다. 
 *  
 *  보통 transient는 직열화가 안되는 클래스를 가지고 있으면 transient를 사용한다 ex) 소켓클래스
 * 
 * */
public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Member member1 = new Member("이순신", "장군");
		Member member2 = new Member("김유신", "장군2");
		
		try (FileOutputStream fr = new FileOutputStream("Serializable.txt");
				ObjectOutputStream ois = new ObjectOutputStream(fr);
		){
			ois.writeObject(member1);
			ois.writeObject(member2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try (FileInputStream fr = new FileInputStream("Serializable.txt");
				ObjectInputStream ois = new ObjectInputStream(fr);
		){
			Member inputMember1 = (Member)ois.readObject();
			Member inputMember2 = (Member)ois.readObject();
			
			System.out.println(inputMember1);
			System.out.println(inputMember2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
