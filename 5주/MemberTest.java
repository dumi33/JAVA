package sec05;
class Member{
	String name;
	String id;
	String pwd;
	int age;
	
	public Member(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
	
	public String getname() {return name;}
	public String getid() {return id;}
	public String getpwd() {return pwd;}
	public int getage() {return age;}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.name = name;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem1 = new Member("대한민국","apple", "1234",20);
		System.out.println("이름 : " + mem1.getname());
		System.out.println("아이디 : " + mem1.getid());
		System.out.println("나이 : " + mem1.getage());

	}

}
