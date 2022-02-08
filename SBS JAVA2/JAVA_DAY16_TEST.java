// 문제 : 사람 3명을 저장할 수 있는 배열을 만들고 사람으로 채워주세요. 3명의 사람에게 자기소개를 시켜보세요.
// 안녕하세요~
public class JAVA_DAY16_TEST {
	public static void main(String[] args) {
	     
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "홍길동";
		p1.age = 22;
		
		p2.name = "전우치";
		p2.age = 22;
		
		p3.name = "이순신";
		p3.age = 33;
		
		// 일괄 처리 => 배열
		
		int[] arr = new int[3];
		String[] strs = new String[3];
		
		// 리모콘 저장 공간 생성
		Person[] people = new Person[3]; // 사람 3명이 만들어진것이 아니라, Person 함수를 조종하는 리모콘 3개를 저장가능한 3개의 공간이
		                                 // 만들어진 것
		
		people[0] = p1;
		people[1] = p2;
		people[2] = p3;
		
		for(int i = 0; i < people.length; i++)
		{
			people[i].introduce();
		}
		
	  }
}

class Person {
	String name;
	int age;
	
	  void introduce() {
	    System.out.printf("안녕하세요 %d살 %s입니다.\n",age,name);
	  }
	}