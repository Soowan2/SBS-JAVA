
public class JAVA_DAY16 {
	
	// ������
	int a = 10; // ����
	
	// a = 100; // ���� ����
	
	// System.out.println("aaa"); // ���ڿ� ���� ó��
	
	// ���� �� ó�� -> �Լ�
	
	
	// ����� ����ϴ� ��� -> �߻����� ���
	// �繰�� �� �� �������� ���� �̾Ƽ� ������ �ν�
	// �ڵ��� -> �پ��� ������ �ִ�
	// �ڵ����� Ÿ�̾�� �����̰�. �극��ũ ����
	
	static String name = "ȫ�浿";
	static int age = 20;
	static double weight = 68.5;


	
public static void main(String args[]) {
	
	Car c1 = new Car();
	c1.modeL = "���";
	c1.speed = 200;
	c1.year = 2020;
	
	Car c2 = new Car();
	c2.modeL = "���������";
	c2.speed = 190;
	c2.year = 2021;
	
	Car c3 = new Car();
	c3.modeL = "������";
	c3.speed = 180;
	c3.year = 2019;
	
	c1.run();
	c2.run();
	c3.run();
	
 
	
	
	}

}

class Car {
	
	String modeL;
	int speed;
	int year;
	
	public void run() {
		System.out.printf("�ڵ��� %s�� %d�� �ӷ����� �޸��ϴ�.\n",modeL,speed);
	}

	public void accel() {
	
	speed += 10; // ���� �� ó��
	
    }


	public void decel() {
	
	speed -= 10;
	
    }
	}