import java.util.Random;
import java.util.Scanner;

public class JAVA_DAY10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� API
		
//		Random rd = new Random(); // ���� ��ü ����
//		
//		int no = rd.nextInt(45); // 0 ~ 45 ������ ������ �� ����
//		
//		for(int i = 0; i < 6; i++)
//		{
//			System.out.println("["+(rd.nextInt(45)+1)+"]");
//		}
//		
		// 2. continue, break : �ݺ��� ����
		
		// ���� �ݺ� ����
		
		while(true) {
			System.out.println("Hello");
		break;
		}
		
		// ���� ��� ����
	
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i);
			
			
		}
		
		// ���� �ݺ��� ����
		// break, continue �� �ڽ��� ���� �ݺ������׸� ����ȴ�
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				break;
			}
		}
		
		
	}
}
