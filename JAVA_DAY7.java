
public class JAVA_DAY7 {
	
	static int a = 10; // ��� �Լ��� ���� ���� ����
	
	// �⺻ ���� �Լ�
	public static int test2(int k, int j) {
		
		System.out.println(k + j);
		
		// ���� -> �Լ��� ����
		return k;
	}
	
	// �⺻ ���� �Լ�
	public static void test() {
		System.out.println("�� �ϴ���");
		System.out.println("�� �ϴ���");
	
		System.out.println("�� �ϴ���");
	}
	
	// ���θ޼���(�Լ�) : ���� �ϴ� ����
	
	
	public static void main(String[] args) {
		 
		// �Լ� -> �ż���
		 
       test(); // ȣ��
       
       int k = 21;
       int j = 12;
       
       int result = test2(k,j);
       
       System.out.printf("result�� �� : %d",result);
    		   
		
	 } //main
} // JAVA_DAY7
