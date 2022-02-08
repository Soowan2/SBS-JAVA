public class DAY2 {

 

	public static void main (String[] args) {

	

	

	System.out.println(1.0 + 1); // 형변환 규칙 : 안전하면 형변환이 가능하다.

	                             // 정수 -> 실수 : 안전하다. 형변환이 가능하다

	                             // 실수 -> 정수 : 안전하지 않다. 현변환이 불가능하다.

	                             // 작은것 -> 큰것 : 안전하다. 형변환이 가능하다.

	                             // 큰것 -> 작은것 : 안전하지 않다. 형변환이 불가능하다.

	

	int a; // 변수 선언 

	       // 크기와 모양 결정 -> 자료형

	       // 이름 결정

	              

	a = 1; // 대입(초기화)

	

	System.out.println(a); // a 값을 출력

	

	byte b = 1;

	short s = 2000;

	int i = 1; 

	long l = 1;

	

	//b = s;  큰것 -> 작은것 이므로 형변환이 불가능하다.

	s = b; // b가 short로 형변환이 돼서 대입된다.

	       // 작은것 -> 큰것 이므로 현변환이 가능하다.

	

	float f = (float)1.0; // 수동형변환 (자료형) 을 숫자앞에 붙혀 사용할 수 있다.

	double d = 2.0;

	

	       // = (대입연산자) 가 나오면 오른쪽에 값, 왼쪽에 변수

	

	       /* 

	        *  변수 사용시 주의사항

	        *  1. = 사용시 왼쪽 오른쪽 구분

	        *  2. 중복선언 하지않기

	        *  

	        *  명명시 주의사항

	        *  1. 숫자로 시작 X              ex) int 123;

	        *  2. 언더바 제외한 특수문자 X      ex) int $#%

	        *  3. 공백 X                   ex) int a a;

	        *  4. 소문자로 작성, 단 변수명이 길어질경우 단어와 단어 사이를 대문자로 구별  ex) int myNumber;

	       */

	                           

	int age = 21;

	String name = "박수완";

	

	System.out.printf("안녕하세요 %d살 %s입니다.\n", age , name);    // 포멧 출력

	                                                            // 줄바꿈 : \n

	System.out.println("안녕하세요 " + age + "살 " + name + "입니다."); // 이런식으로도 출력 가능

 

	

	

	

	}

}