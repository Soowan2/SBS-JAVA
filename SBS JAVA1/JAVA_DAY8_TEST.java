
public class JAVA_DAY8_TEST {
	
	public static boolean isNegative(int a) 
	{
		if (a < 0)
		{
			return true;
		}
		return false;
	}
	
public static void main (String[] args) {
	
	// 0은 양수로 보겠습니다.
    int no = -1;

    if(isNegative(no))
    {
      System.out.println("음수입니다.");
    } 
    
    else 
    {
      System.out.println("양수입니다.");
    }
    // no 값을 바꿔가면서 테스트해보세요.
	
	
	
}
}
