package DAY8;

public class DAY8_2 {
	public static void main(String args[]) {
		
		�ҳ�Ÿ �ҳ�Ÿ1 = new �ҳ�Ÿ();
		��Ÿ�� ��Ÿ��1 = new ��Ÿ��();
		
//		�ҳ�Ÿ1.����();
//		�ҳ�Ÿ1.ũ����();
//		
//		��Ÿ��1.����();
//		��Ÿ��1.������();
		
		�ڵ��� �ڵ���1 = �ҳ�Ÿ1;
		
		�ڵ���1.����();
		
		// ����Ŭ������ ����Ŭ������ ����� �ٲٴ°� ����� ����ȯ�� ���ָ� �ȴ�.
		��Ÿ�� ��Ÿ��2 = (��Ÿ��)�ڵ���1;
		
	}

}

abstract class �ڵ���{
	abstract void ����();
	
}

class �ҳ�Ÿ extends �ڵ��� {
	void ����() {
		System.out.println("�����ϰ� �����մϴ�.");
	}
	
	void ũ����() {
		System.out.println("������ �ӵ��� �����մϴ�.");
	}
}

class ��Ÿ�� extends �ڵ��� {
	void ����() {
		System.out.println("�����ϰ� �����մϴ�.");
	}
	
	void ������() {
		System.out.println("��� �����մϴ�.");
	}
}