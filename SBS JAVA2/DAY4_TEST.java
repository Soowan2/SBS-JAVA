package DAY4;

class DAY4_TEST {
	  public static void main(String[] args) {
	    // �� �л��鿡�� ���� ������ ������ �����ϰ� ������ּ���.

	    �л� s1 = new �л�(1, "ȫ�浿", 20);
	    �л� s2 = new �л�(2, "ȫ���", 21);

	    s1.introduce();
	    s1.teacher();
	    // ��� : �ȳ��ϼ��� ���� 1�� 20�� ȫ�浿�̰��, ���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.
	    s2.introduce();
	    s2.teacher2();
	    // ��� : �ȳ��ϼ��� ���� 2�� 21�� ȫ����̰��, ���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.
	    
	    
	    // �� ����� ���Ӽ������� �ٲ�����ϴ�. �Ʒ��� ���� ������ּ���. 
        s1.introduce();
        s1.teacher2();
	    // ��� : �ȳ��ϼ��� ���� 1�� 20�� ȫ�浿�̰��, ���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.
	    s2.introduce();
	    s2.teacher();
	    // ��� : �ȳ��ϼ��� ���� 2�� 21�� ȫ����̰��, ���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.
	  }
	}

class �л�{
	private String name;
	private int age;
	private int num;
	
	public �л� (int num,String name,int age) {
		this.name = name;
		this.num = num;
		this.age = age;
		
	}
	
	void introduce() {
		System.out.printf("�ȳ��ϼ��� ���� %d�� %d�� %s�̰��, ",num,age,name);
	}
	void teacher() {
		System.out.println("���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.");
	}
	void teacher2() {
		System.out.println("���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.");
	}
}

