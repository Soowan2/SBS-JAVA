public class JAVA_DAY12 {
	
	public static void gugu(int dan, int k) 
	{
		for(int i = 1; i <= k; i++)
		{
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
	
	public static int square(int i)
	{
		return i*i;			     	
	}
	
	// ���� �Լ� : ó���Ǵ� ����
public static void main(String[] args) {
	
	
	// ���α׷����� ����ȭ �ϴ� ����
	// ����ȭ -> ����� ���� ��
	
	// �Լ�, �޼��� : �������� �ڵ�(����)�� ���ٷ� ����� ��.
	
	gugu(3, 100); // 3�� 100��
	
	gugu(4, 50); // 4�� 50��
	
	
	// return�� �̿��Ͽ� ����
	int num = square(5) + square(6);
	
	System.out.printf("%d\n", num);
	
	// 1���� 10���� ������ ��
	
	int sum = 0;
	
	for(int i = 1; i <= 10; i++)
	{
		sum += square(i);
	}
	
	System.out.println(sum);
	
}
}
