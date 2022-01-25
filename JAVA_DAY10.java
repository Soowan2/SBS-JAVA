import java.util.Random;
import java.util.Scanner;

public class JAVA_DAY10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 난수 생성 API
		
//		Random rd = new Random(); // 랜덤 객체 생성
//		
//		int no = rd.nextInt(45); // 0 ~ 45 사이의 랜덤한 수 생성
//		
//		for(int i = 0; i < 6; i++)
//		{
//			System.out.println("["+(rd.nextInt(45)+1)+"]");
//		}
//		
		// 2. continue, break : 반복문 제어
		
		// 무한 반복 구조
		
		while(true) {
			System.out.println("Hello");
		break;
		}
		
		// 범위 기반 구조
	
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i);
			
			
		}
		
		// 이중 반복문 구조
		// break, continue 는 자신이 속한 반복문한테만 적용된다
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				break;
			}
		}
		
		
	}
}
