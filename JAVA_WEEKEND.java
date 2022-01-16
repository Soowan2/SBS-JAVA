
import java.util.Scanner;

public class JAVA_WEEKEND {
	
	 public static void main(String[] args) {
		    
		  // 문제 : 안녕하세요 29세 홍길동입니다. 를 이름과 나이를 입력받아서 출력하기
		 
		    Scanner scan = new Scanner(System.in);

		    System.out.println("이름을 입력해주세요:");
		    
		    String name = scan.nextLine();
		    
		    System.out.println("나이를 입력해주세요:");
		    
		    String age = scan.nextLine();
		    
		    System.out.println("안녕하세요 "+ age +"세 "+ name +"입니다.");
		    

		  

		  }
}

