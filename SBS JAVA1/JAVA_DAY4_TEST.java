import java.util.Scanner;

public class JAVA_DAY4_TEST {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		// ���̸� �Է��ؼ� ������ ���� ������ּ���.
		
		System.out.println("���̸� �Է��ϼ��� : ");
		
		int age = Integer.parseInt(scan.nextLine());
		
		if(age < 8) {
		System.out.println("��ġ���� �Դϴ�.");
	    }
		else if(age <= 13) {
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if(age <= 16) {
			System.out.println("���л� �Դϴ�.");
		}
		else if(age <= 19) {
			System.out.println("����л� �Դϴ�.");
		}
		else if(age <= 24) {
			System.out.println("���л� �Դϴ�.");
		}
		else {
			System.out.println("�л��� �ƴմϴ�.");
		}
			
		}
}
