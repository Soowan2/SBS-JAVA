public class JAVA_DAY15 {


	public static void main(String args[]) {

		Person p1 = new Person(); // new 이용해서 객체를 만들면 객체를 조종할 수 있는 리모콘이 나온다.
		Person p2 = new Person(); 
		Person p3 = new Person();
		
		p1.age = 20;
		p1.name = "홍길동";
		p1.home = "대전";
		
		p1.introduce();
		p1.addAge();

		
		p2.age = 30;
		p2.name = "이순신";
		p2.home = "서울";
					
		p2.introduce();
		p2.addAge();

		
		p3.age = 22;
		p3.name = "박수완";
		p3.home = "대전";
							
		p3.introduce();
		p3.addAge();

	
	}

}

class Person{

	// static을 빼서 객체들의 데이터를 따로 저장
    int age;
	String name;
	String home;

	// 함수에 static을 붙이면 static을 붙힌 변수만 사용가능
	public void introduce() {
		System.out.printf("%s에 사는 %d살 %s입니다.\n", home, age, name);
	}

	public void addAge() {
		age++;
		System.out.printf("%s의 나이가 %d에서 %d로 한살 먹었습니다.\n", name, age-1, age);
	}
}