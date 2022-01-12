
public class Test {//자바 코드를 작성하는 영역. {} 는 영역을 나타낸다.

	// 자바 코드를 실행하는 진입점 - 메인+(메서드)
	public static void main(String[] args) {
		
		
		// 실행되는 자바 코드는 여기에 작성
	
		// 출력
		// 실행하는 방법 -> F11
		// ; -> 세미콜론 : 명령어와 명령어를 구분하기 위함
		
		System.out.println(100);
		
		// 일반 문자와 명령어를 구별하기 위해 "" 사용
		System.out.println("박수완");
		
		System.out.println(100 + 100);
		
		// 숫자랑 문자랑 표현도 다르고, 사용법도 다르다.
		// 숫자 자료형, 문자 자료형 -> 자료형을 구분해라.
		// 숫자형 -> int
		// 문자형 -> String
		
		// 자료형의 종류 
		/* 1. 정수 
		 *    - byte   (1) -128 ~ 127
		 *    - short  (2) -33000 ~ 33000
		 *    - int    (4) -21억 ~ 21억
		 *    - long   (8) -900경 ~ 900경
		 * 2. 실수
		 *    - float  (4) 소수점 7자리
		 *    - double (8) 소수점 16자리 
		 * 3. 문자형
		 *    - String 
		 */
		
		System.out.println(2.0);
		System.out.println(2);
		System.out.println("2");
		
		// 정수랑 실수랑 계산 x
		
		System.out.println(1.0 + 1); // 1.0과 1이 더해진게 아니고, 1이 1.0으로 변환돼서 실수 + 실수 == 형변환
		                             // 형변환은 데이터를 보존할 수 있을 때만 가능하다.
		
	}
	
}
