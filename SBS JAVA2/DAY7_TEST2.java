package DAY7;

public class DAY7_TEST2 {
	public static void main(String[] args) {
	    
	    ���2 ���1 = new ö��();

	    ���1.�ȴٸ��������̴�();
	    ���1.��̻�Ȱ();
	    // ��� : �ȴٸ��� �����Դϴ�.
	    // ��� : ö���� �౸���մϴ�.

	    ���2 ���2 = new ����();

	    ���2.������();
	    ���2.��̻�Ȱ();
	    // ��� : ���� ���ϴ�.
	    // ��� : ���� ������ �մϴ�.
	    
	    ���2 ���3 = new �浿();
	    
	    ���3.���ڴ�();
	    ���3.��̻�Ȱ();
	    // ��� : ��ϴ�
	    // ��� : �浿�� �뷡�� �θ��ϴ�.
	  }
}

abstract class ���2 {
	  abstract void ��̻�Ȱ();
	  
	  void �ȴٸ��������̴�() {
	    System.out.println("�ȴٸ��� �����Դϴ�.");
	  }

	  void ������() {
	    System.out.println("���� ���ϴ�.");
	  }

	  void ���ڴ�() {
	    System.out.println("��ϴ�.");
	  }
	}

class ö�� extends ���2 {
	void ��̻�Ȱ() {
		System.out.println("ö���� �౸�� �մϴ�.");
	}
}

class ���� extends ���2 {
	void ��̻�Ȱ() {
		System.out.println("���� ������ �մϴ�.");
	}
}

class �浿 extends ���2 {
	void ��̻�Ȱ() {
		System.out.println("�浿�� �뷡�� �θ��ϴ�.");
	}	
}