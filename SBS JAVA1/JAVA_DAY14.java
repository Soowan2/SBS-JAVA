import java.util.Scanner;

public class JAVA_DAY14 {

//	public static void introduce(String home, int age, String name) {
//
//		System.out.printf("%s�� ��� %d�� %s�Դϴ�.\n", home, age, name);
//	}
//	
//	public static void addAge(int age, String name) {
//		int addedAge = age + 1;
//		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.", name, age, addedAge);
//	}

	public static void main(String args[]) {

		// ��� : ����, �̸�, ����
		// �� ����� ǥ���ϱ� ���� ������ ������
		// ��� : �ڱ�Ұ�, ���̸Ա�

//		int age = 20;
//		String name = "ȫ�浿";
//		String home = "����";

//      ����ȭ -> ���α׷��� = ����ȭ�ϴ� �۾�
		// �ϳ��� ������ ��������� �� ������ ���纻�� ���� �������.
//		Person.introduce();
//		Person.addAge();
		
		// Person ���纻 �����
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.introduce();
		p1.addAge();

		p2.introduce();
		p2.addAge();
		
//		introduce(home, age, name);
//		introduce(home2, age2, name2);
//		
//		addAge(age2,name2);
		
		// �����Ͱ� �ٸ��� ������ ������ ������ �̰� �����Ŵ�. => ��Ȱ��
		// ���� ��Ȱ�� -> ����
		// ������ ��Ȱ�� -> �Լ�
		// ������ �Լ��M ������ ��Ȱ�� -> Ŭ������ ��ü

	}

}

// ��� Ŭ���� -> �����ͱ��� + �Լ�
class Person{

	static int age = 20;
	static String name = "ȫ�浿";
	static String home = "����";

	public static void introduce() {

		System.out.printf("%s�� ��� %d�� %s�Դϴ�.\n", home, age, name);
	}

	public static void addAge() {
		int addedAge = age + 1;
		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age, addedAge);
	}
}