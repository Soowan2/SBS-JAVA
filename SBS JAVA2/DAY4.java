package DAY4;

public class DAY4 {
public static void main(String args[]) {
	
	ȫ�浿 aȫ�浿 = new ȫ�浿();
	
	ȫ��� bȫ��� = new ȫ���();
	
	aȫ�浿.C���α׷���();
	aȫ�浿.�ڹ����α׷���();
	bȫ���.���̽����α׷���();
		
	}	
}

class ȫ�浿{
	
	ȫ��� bȫ��� = new ȫ���();
	
	void C���α׷���() {
		bȫ���.C���α׷���();
	}
	
	void �ڹ����α׷���() {
		System.out.println("JAVA 18�������� ���α׷��� �մϴ�.");
	}
}

class ȫ��� {
	void ���̽����α׷���() {
		System.out.println("���̽� 3.10 ���α׷����� �մϴ�.");		
	}
	
	void C���α׷���() {
		System.out.println("C ǥ��1 ���α׷����� �մϴ�.");
	}
}