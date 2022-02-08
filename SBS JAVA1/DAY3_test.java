import java.util.Scanner;

public class DAY3_test {
	//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
	//입출력 예시
	//첫번째 숫자를 입력해주세요: 12
	//두번째 숫자를 입력해주세요: 33
	//12 + 33 = 45
	 public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("첫번째 숫자를 입력해주세요 : ");
		  String num1 = scan.nextLine();
		  
		  System.out.println("두번째 숫자를 입력해주세요 : ");
		  String num2 = scan.nextLine();
		  
		  int num3 = Integer.parseInt(num1);
		  int num4 = Integer.parseInt(num2);
		  
		  System.out.println( "num3" (num3 + num4) );
				  
		  
		  // Integer.parseInt(); : 문자를 숫자로 바꾸어준다.
		  
		  
		  
		  
	  }
	    
	  
}
