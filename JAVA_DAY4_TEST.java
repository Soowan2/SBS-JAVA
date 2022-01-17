import java.util.Scanner;

public class JAVA_DAY4_TEST {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		// 나이를 입력해서 학적이 뭔지 출력해주세요.
		
		System.out.println("나이를 입력하세요 : ");
		
		int age = Integer.parseInt(scan.nextLine());
		
		if(age < 8) {
		System.out.println("유치원생 입니다.");
	    }
		else if(age <= 13) {
			System.out.println("초등학생 입니다.");
		}
		else if(age <= 16) {
			System.out.println("중학생 입니다.");
		}
		else if(age <= 19) {
			System.out.println("고등학생 입니다.");
		}
		else if(age <= 24) {
			System.out.println("대학생 입니다.");
		}
		else {
			System.out.println("학생이 아닙니다.");
		}
			
		}
}
