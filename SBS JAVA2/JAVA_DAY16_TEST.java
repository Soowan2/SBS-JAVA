// ���� : ��� 3���� ������ �� �ִ� �迭�� ����� ������� ä���ּ���. 3���� ������� �ڱ�Ұ��� ���Ѻ�����.
// �ȳ��ϼ���~
public class JAVA_DAY16_TEST {
	public static void main(String[] args) {
	     
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "ȫ�浿";
		p1.age = 22;
		
		p2.name = "����ġ";
		p2.age = 22;
		
		p3.name = "�̼���";
		p3.age = 33;
		
		// �ϰ� ó�� => �迭
		
		int[] arr = new int[3];
		String[] strs = new String[3];
		
		// ������ ���� ���� ����
		Person[] people = new Person[3]; // ��� 3���� ����������� �ƴ϶�, Person �Լ��� �����ϴ� ������ 3���� ���尡���� 3���� ������
		                                 // ������� ��
		
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
	    System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.\n",age,name);
	  }
	}