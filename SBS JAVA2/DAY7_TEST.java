package DAY7;

public class DAY7_TEST {
	 public static void main(String[] args) {
		    new ���();
		    // �Ʒ��� ���� ��µǰ� ���ּ���.
		    
		   
		    // ����(String �̸�, int ����) �����!
		    // �̸� : ȫ�浿
		    // ���� : 27
		  }
}

class ����1 {
	 
	  ����1(String �̸�) {
	    System.out.println("����(String �̸�) �����!");
	    System.out.println("�̸� : " + �̸�);
	  }
	  ����1(String �̸�, int ����) {
	    System.out.println("����(String �̸�, int ����) �����!");
	    System.out.println("�̸� : " + �̸�);
	    System.out.println("���� : " + ����);
	  }
	}

	class ��� extends ����1 {

		���(){
			super("ȫ�浿",27);
		}
	}