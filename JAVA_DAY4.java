import java.util.Scanner;

public class JAVA_DAY4 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("���ϴ� ���� �Է����ּ��� : ");
		
		int dan = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%d x %d = %d\n", dan, 1, dan * 1);
		System.out.printf("%d x %d = %d\n", dan, 2, dan * 2);
		System.out.printf("%d x %d = %d\n", dan, 3, dan * 3);
		
		// ��� ������
		// +, -, *, /, %
		// ��� : ����
		
		
		// �� ������
		// <, >, <=, >=, ==, !=
		// ��� : �� ���� -> �� (boolean)
		
		System.out.println(10 > 2);
		
		System.out.println("true"); // true ������ ����
		System.out.println(true);   // ��
		
		boolean b = true;
		
		
		
		// if��
		// ���ǿ� ���� �ڵ� ����
		// �ڵ� ����
		
		int money= 5000;
		
		if(money > 20000) {
		    System.out.println("ġŲ");
		}
		
		// ���� ������ ���� ������ �� ���� -> if ��ø
		if(money<20000) {
			if(money>10000) {
				System.out.println("¥���");	
			}
		}
		
		if(money<10000) {
			System.out.println("���");
		}
	
		*/
		int num1 = 0;
		int num2 = 0;
		
		// ���� �ΰ��� �Է¹ް� �� ū������ �� ���� ���� �� ����� ���
		
		System.out.println("ù��° ���� �Է� : ");
		num1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("�ι�° ���� �Է� : ");
		num2 = Integer.parseInt(scan.nextLine());
		/*
		 1. ù��° ���
		 
		if(num1 >= num2) {
		    System.out.printf("%d - %d = %d",num1,num2,num1-num2);
		}
		
		else {	
			System.out.printf("%d - %d = %d",num2,num1,num2-num1);	
		}
		*/
		
		if(num1 > num2) {
			
			int tmp = num1;
			num1 = num2;
		    num2 = tmp;
			
		}
		
		
		System.out.println(num2 - num1);
		
		
		
		
		
		
		
		
	}
	
}
