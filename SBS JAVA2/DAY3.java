
public class DAY3 {
	public static void main(String args[]) {
		
		
		dog a1 = new dog();
		cat a2 = new cat();
		
		a1.bark();
		a1.baby();
		a1.move();
		a2.bark();
		a2.move();
		a2.baby();
		
		// ��� -> �ڵ带 �����ش�. -> �ڵ� ����
		
	}

}
class animal{
	void move() {
		System.out.println("�����Դϴ�");
	}
	void baby() {
		System.out.println("������ �����ϴ�.");
	}
}

class dog extends animal {

	void bark() {
		System.out.println("�۸�");
	}

}

class cat extends animal {
	
	void bark() {
		System.out.println("�߿�");
	}

}