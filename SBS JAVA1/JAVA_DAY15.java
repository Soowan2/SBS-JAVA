public class JAVA_DAY15 {


	public static void main(String args[]) {

		Person p1 = new Person(); // new �̿��ؼ� ��ü�� ����� ��ü�� ������ �� �ִ� �������� ���´�.
		Person p2 = new Person(); 
		Person p3 = new Person();
		
		p1.age = 20;
		p1.name = "ȫ�浿";
		p1.home = "����";
		
		p1.introduce();
		p1.addAge();

		
		p2.age = 30;
		p2.name = "�̼���";
		p2.home = "����";
					
		p2.introduce();
		p2.addAge();

		
		p3.age = 22;
		p3.name = "�ڼ���";
		p3.home = "����";
							
		p3.introduce();
		p3.addAge();

	
	}

}

class Person{

	// static�� ���� ��ü���� �����͸� ���� ����
    int age;
	String name;
	String home;

	// �Լ��� static�� ���̸� static�� ���� ������ ��밡��
	public void introduce() {
		System.out.printf("%s�� ��� %d�� %s�Դϴ�.\n", home, age, name);
	}

	public void addAge() {
		age++;
		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age-1, age);
	}
}