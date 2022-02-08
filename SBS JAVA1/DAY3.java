import java.util.Scanner;

public class DAY3 {

	public static void main (String[] args) {
		/*
		// syso + ctrl + space : 출력 단축키
		
		// 출력
		System.out.println("aaa"); 
		
		// 입력
		//System.in.read();
		
		// System.in // 콘솔에 입력되는 것을 의미한다.
		Scanner scan = new Scanner(System.in);
		
		scan.next(); // 스캐너에 들어온 문자를 공백이 나오기 전까지 읽어들인다.
		scan.nextLine(); // 다음 줄이 나올 때까지 읽어들인다. 
		
		String str2 = scan.next(); // scan.next()를 한번 더 사용하면 직전까지 읽어들인 곳부터 공백이 나오기 전까지 읽어들인다.
		
		System.out.println(str2);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		
		
		String name = scan.nextLine();
		
		
		System.out.println("안녕하세요 "+ name + "님! 반갑습니다.");
		
		
		
	}
	
}
