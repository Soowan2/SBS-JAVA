// ���� : �ڵ��� ��ü�� ���� ������ ������ּ���.
// �ڵ��� ��ü�� ������ ��� �� ������ �̿��� �ְ�ӷ��� ���� �ٸ��� ������ּ���.
// �� �ڵ����� �ڽ��� �ְ�ӷ����� �޸��� ���ּ���.

public class JAVA_DAY15_TEST2 {
	public static void main(String[] args) {

		car c1 = new car();
		c1.high = 220;
		
		car c2 = new car();
		c2.high = 250;
		
		c1.run();
		c2.run();
		
	    // ��� : �ڵ����� �ִ�ӷ� 220km�� �޸��ϴ�.
	    // ��� : �ڵ����� �ִ�ӷ� 250km�� �޸��ϴ�.
	  }
}

class car{
	int high;
	public void run(){
		System.out.printf("�ڵ����� �ִ�ӷ� %dkm�� �޸��ϴ�.\n",high);		
	}
}