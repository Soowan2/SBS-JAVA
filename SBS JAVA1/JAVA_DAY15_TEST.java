
public class JAVA_DAY15_TEST {
	// ���� : �ڵ����� 3�� �޸��� ���ּ���.
		// ��� : �ڵ����� �޸��ϴ�.
public static void main(String args[]) {
	


	    //v1. 1���� �ڵ����� 3�� �޸��� ���ּ���.

	car c1 = new car();

	c1.num = 1;
	
	c1.run();

	
	    //v2. 3���� �ڵ����� 1���� �޸��� ���ּ���.

	car c2 = new car();
	c2.num = 2;

	car c3 = new car();
	c3.num = 3;
	
	c1.run();
	c2.run();
	c3.run();
	    //�ڵ����� �޸��ϴ�.
	    //�ڵ����� �޸��ϴ�.
	    //�ڵ����� �޸��ϴ�.
	    //�ڵ����� �޸��ϴ�.
	    //�ڵ����� �޸��ϴ�.
	    //�ڵ����� �޸��ϴ�.
	
	
}

}

class car{
	int num;
	
	public void run() {
		System.out.printf("%d�� �ڵ����� �޸��ϴ�\n",num);
	}
	
	
}