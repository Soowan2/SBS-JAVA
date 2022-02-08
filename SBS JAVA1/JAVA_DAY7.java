
public class JAVA_DAY7 {
	
	static int a = 10; // 모든 함수가 같이 쓰는 변수
	
	// 기본 형태 함수
	public static int test2(int k, int j) {
		
		System.out.println(k + j);
		
		// 리턴 -> 함수의 종료
		return k;
	}
	
	// 기본 형태 함수
	public static void test() {
		System.out.println("일 하는중");
		System.out.println("일 하는중");
	
		System.out.println("일 하는중");
	}
	
	// 메인메서드(함수) : 일을 하는 직원
	
	
	public static void main(String[] args) {
		 
		// 함수 -> 매서드
		 
       test(); // 호출
       
       int k = 21;
       int j = 12;
       
       int result = test2(k,j);
       
       System.out.printf("result의 값 : %d",result);
    		   
		
	 } //main
} // JAVA_DAY7
