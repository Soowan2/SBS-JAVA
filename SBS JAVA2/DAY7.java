package DAY7;

public class DAY7 {
	
	public static void main(String args[]) {
		
		����� �����1 = new �����(20);
		�����1.�߿�();
	    
		����� �����2 = new �����();
		�����2.���� = 10;
		�����2.�߿�();
	}
	
}

class ���� {
	protected int ����;
	
	����(){
		System.out.println("������ ��������ϴ�.");
	}
	
	void ������() {
		System.out.println("������");
	}
}

class ����� extends ���� {
	
//	�����(){
//		super(); //�ڽ��� �θ� ����Ŵ
//	}
	
	// ������ �ٸ��ų�, Ÿ���� �ٸ��� �����ϴ�.
	// �����ε� : ���� �̸����� �޼��带 ������ ����°�
	�����(int ����){
		�ʱ�ȭ();
		this.���� = ����;
	}
	�����(){
		�ʱ�ȭ();
	}
	
	void �ʱ�ȭ() {
		System.out.println("����̰� ��������ϴ�.");
	}
	
	void �߿� () {
		System.out.printf("%d�� ¥�� ����̰� �߿�\n", ����);
	}
}