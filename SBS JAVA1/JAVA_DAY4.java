import java.util.Scanner;

public class JAVA_DAY4 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("원하는 단을 입력해주세요 : ");
		
		int dan = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%d x %d = %d\n", dan, 1, dan * 1);
		System.out.printf("%d x %d = %d\n", dan, 2, dan * 2);
		System.out.printf("%d x %d = %d\n", dan, 3, dan * 3);
		
		// 산술 연산자
		// +, -, *, /, %
		// 결과 : 숫자
		
		
		// 비교 연산자
		// <, >, <=, >=, ==, !=
		// 결과 : 참 거짓 -> 논리 (boolean)
		
		System.out.println(10 > 2);
		
		System.out.println("true"); // true 문자의 나열
		System.out.println(true);   // 참
		
		boolean b = true;
		
		
		
		// if문
		// 조건에 따라 코드 실행
		// 코드 제어
		
		int money= 5000;
		
		if(money > 20000) {
		    System.out.println("치킨");
		}
		
		// 여러 조건을 동시 만족할 때 실행 -> if 중첩
		if(money<20000) {
			if(money>10000) {
				System.out.println("짜장면");	
			}
		}
		
		if(money<10000) {
			System.out.println("라면");
		}
	
		*/
		int num1 = 0;
		int num2 = 0;
		
		// 숫자 두개를 입력받고 더 큰수에서 더 작은 수를 뺀 결과를 출력
		
		System.out.println("첫번째 숫자 입력 : ");
		num1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("두번째 숫자 입력 : ");
		num2 = Integer.parseInt(scan.nextLine());
		/*
		 1. 첫번째 방법
		 
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
