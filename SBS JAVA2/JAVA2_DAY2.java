
public class JAVA2_DAY2 {
	
	
	public static void main(String args[]) {
		
		// 객체는 정보 덩어리
		// 객체는 반드시 초기화해야 의미가 있음.
//		Person p1 = new Person();
//		p1.setData(20, "홍길동", "서울");
//	
//		p1.introduce();
//		
//		Person p2 = new Person();
		
		Person p3 = new Person(20, "홍길동", "대전");
		p3.introduce();
		
		Person p4 = new Person(30, "이순신", "서울");
		p4.introduce();
		
		
		
	}

}

class Person{
	
	private int age;
	private String name;
	private String home;
	
	void introduce() {
		System.out.printf("안녕하세요 %s사는 %d살 %s입니다.\n",home, age, name);
	}
	
	void setAge(int age) {
		if(age < 0)
		{
			System.out.println("함수는 음수가 될 수 없습니다.");
			return;
		}
		
		this.age = age;
	}
	
	Person(int age, String name, String home){
		System.out.println("사람이 태어납니다.");
		this.age = age;
		this.name = name;
		this.home = home;
	}
	// this : 객체(인스턴스) 자신을 가리킨다.
	
	// 생성자 -> 객체가 만들어지면 반드시 실행.
	// 클래스명과 동일
	// 리턴타입 X
//	Person(int age, String name, String home) {
//		this.age = age;
//		this.name = name;
//		this.home = home;
//	}
	
}