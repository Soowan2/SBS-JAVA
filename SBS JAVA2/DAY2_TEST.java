
public class DAY2_TEST {

  // ���� Ŭ�������� �����ڸ� �̿��� �����ϰ� ���� �������ּ���.

	public static void main(String[] args) {

      Person2 p1 = new Person2(20,"ȫ�浿"); // ����� �¾�ϴ�.
     
      Person2 p2 = new Person2(25,"ȫ���"); // ����� �¾�ϴ�.
      

	    p1.introduce(); // �ȳ��ϼ��� 27�� ȫ�浿�Դϴ�.
	    p2.introduce(); // �ȳ��ϼ��� 25�� ȫ����Դϴ�.
//
	    Car c1 = new Car("�ҳ�Ÿ","�Ͼ��",100); // �ڵ����� ��������ϴ�.
	    
	    Car c2 = new Car("���","������",70); // �ڵ����� ��������ϴ�.
	    

	    c1.drive(); // �Ͼ�� �ҳ�Ÿ��/�� 100km�� �޸��ϴ�.
	    c2.drive(); // ������ �����/�� 70km�� �޸��ϴ�.


	    Cat cat1 = new Cat("�Ƹ�","���þȺ��",4); // ����̰� �¾�ϴ�.
	    
        Cat cat2 = new Cat("����","��",6); // ����̰� �¾�ϴ�.
	    
	    cat1.meow(); // 4�� ���þȺ�� ����� �Ƹ��� �߿��ϰ� ��ϴ�.
	    cat2.meow(); // 6�� �� ����� ���� �߿��ϰ� ��ϴ�.


	    Warrior w1 = new Warrior("�̼���",20,10); // ���簡 �¾�ϴ�.


        Warrior w2 = new Warrior("������", 15, 15); // ���簡 �¾�ϴ�.
	   


	    w1.status(); // �̸� : �̼���, ���ݷ� : 20, ���� : 10 
	    w2.status(); // �̸� : ������, ���ݷ� : 15, ���� : 15 

	    w1.attack(); // �̼����� 20�� �������� �����δ�.
	    w2.attack(); // �������� 15�� �������� �����δ�. 

	    w1.defense(); // �̼����� 10 �������� ����մϴ�.
	    w2.defense(); // �������� 15 �������� ����մϴ�.

	}
}

class Person2{
	int age;
	String name;
	Person2(int age,String name){
		System.out.println("����� �¾�ϴ�.");
		this.age = age;
		this.name = name;
	}

	public void introduce() {
    System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.\n", age, name);
	}
}

class Car {
	String model;
	String color;
	int speed;
	
	Car(String model, String color, int speed){
		System.out.println("�ڵ����� ��������ϴ�.");
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public void drive() {
		System.out.printf("%s %s��/�� %dkm�� �޸��ϴ�.\n", color, model, speed);
	}
}

class Cat {
	String name;
	String kind;
	int age;
	
	Cat(String name,String kind,int age){
		System.out.println("����̰� �¾�ϴ�.");
		this.name = name;
		this.kind = kind;
		this.age = age;
	}

	public void meow() {
		System.out.printf(" %d�� %s ����� %s�� �߿��ϰ� ��ϴ�.\n", age, kind, name);
	}
}


class Warrior {
	
	// ����
	String name;
	int attack;
	int defense;
	
	Warrior(String name, int attack, int defense){
		System.out.println("���簡 �¾�ϴ�.");
		this.name = name;
		this.attack = attack;
		this.defense = defense;
	}
	// ����
	public void status() {
		System.out.printf("�̸� : %s, ���ݷ� : %d, ���� : %d \n", name, attack, defense);
	}
	public void attack() {
		System.out.printf("%s�� %d�� �������� �����δ�.\n", name, attack);
	}
	public void defense() {
		System.out.printf("%s�� %d �������� ����մϴ�..\n", name, defense);
	}
}


