public class JAVA_DAY12 {
	
	public static void gugu(int dan, int k) 
	{
		for(int i = 1; i <= k; i++)
		{
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
	
	public static int square(int i)
	{
		return i*i;			     	
	}
	
	// 메인 함수 : 처리되는 영역
public static void main(String[] args) {
	
	
	// 프로그래밍은 구조화 하는 과목
	// 구조화 -> 덩어리로 보는 것
	
	// 함수, 메서드 : 여러줄의 코드(절차)를 한줄로 만드는 것.
	
	gugu(3, 100); // 3단 100곱
	
	gugu(4, 50); // 4단 50곱
	
	
	// return을 이용하여 연산
	int num = square(5) + square(6);
	
	System.out.printf("%d\n", num);
	
	// 1부터 10까지 제곱의 합
	
	int sum = 0;
	
	for(int i = 1; i <= 10; i++)
	{
		sum += square(i);
	}
	
	System.out.println(sum);
	
}
}
