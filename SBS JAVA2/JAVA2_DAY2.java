
public class JAVA2_DAY2 {
	
	
	public static void main(String args[]) {
		
		// ��ü�� ���� ���
		// ��ü�� �ݵ�� �ʱ�ȭ�ؾ� �ǹ̰� ����.
//		Person p1 = new Person();
//		p1.setData(20, "ȫ�浿", "����");
//	
//		p1.introduce();
//		
//		Person p2 = new Person();
		
		Person p3 = new Person(20, "ȫ�浿", "����");
		p3.introduce();
		
		Person p4 = new Person(30, "�̼���", "����");
		p4.introduce();
		
		
		
	}

}

class Person{
	
	private int age;
	private String name;
	private String home;
	
	void introduce() {
		System.out.printf("�ȳ��ϼ��� %s��� %d�� %s�Դϴ�.\n",home, age, name);
	}
	
	void setAge(int age) {
		if(age < 0)
		{
			System.out.println("�Լ��� ������ �� �� �����ϴ�.");
			return;
		}
		
		this.age = age;
	}
	
	Person(int age, String name, String home){
		System.out.println("����� �¾�ϴ�.");
		this.age = age;
		this.name = name;
		this.home = home;
	}
	// this : ��ü(�ν��Ͻ�) �ڽ��� ����Ų��.
	
	// ������ -> ��ü�� ��������� �ݵ�� ����.
	// Ŭ������� ����
	// ����Ÿ�� X
//	Person(int age, String name, String home) {
//		this.age = age;
//		this.name = name;
//		this.home = home;
//	}
	
}