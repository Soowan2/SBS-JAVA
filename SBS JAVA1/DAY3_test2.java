import java.util.Scanner;

public class DAY3_test2 {
	// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);

	    System.out.println("이름을 입력해주세요:");
	    
	    String str1 = scan.nextLine();
	    
	    System.out.println("나이를 입력해주세요:");
	    
	    String str2 = scan.nextLine();
	    
	    System.out.println("안녕하세요 " + str2 + "세 " + str1 + "입니다.");

	    // 출력 : 안녕하세요 29세 홍길동입니다.

	  }
}
