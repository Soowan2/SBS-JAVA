
public class JAVA_DAY16 {
	public static void main(String args[]) {
		
		
		// ��ü��?
		// ������ + �Լ� ����
		// ���� + ���� �繰�̳� ����
		// Ŭ������ ��ü -> Ŭ���� : Ʋ(�������ΰ�), ��ü : ��ü
		// �ڵ��� -> �ƿ��, �ƹݶ�, ���
		// �౸���� -> ȣ����, �����, �޽�
		// ���� -> ¥���, ����, ������
		
		// ������ ����, ���� -> class ����
		// ��ü�� �������
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.speed = 30;
		c1.model = "��Ÿ��";
		c1.drive();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class Car{
	int speed;
	String model;
	
	public void drive() {		
		System.out.printf("%s�� %dkm�� �ӵ��� �޸��ϴ�.\n",model,speed);
	}
}