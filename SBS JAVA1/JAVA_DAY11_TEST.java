import java.util.Random;

public class JAVA_DAY11_TEST {
	public static void main(String[] args) {
		
//		Random random = new Random();
//		
//		int[] num = new int [7];
//		
//		for(int i = 0; i < num.length; i++) 
//		{
//		
//		num[i] = random.nextInt(7) + 1; // num[i]에 1부터7까지 랜덤 숫자 부여
//		
//		
//		   for(int k = 0; k < i; k++) // 집가서 고민하자
//		   {
//			   if(num[i] == num[k])
//			   {
//				   while(num[i] == num[k]) 
//				   {
//				       num[i] = random.nextInt(7) + 1;
//				   }
//			   }
//		   }
//	
//		}
//		
//		
//		
//		
//		for(int i = 0; i < num.length; i++)
//		{
//		System.out.println(num[i]);
//		}
		
		
		int[] num = {2,4,3,6,5,1};
		
		for(int k = 0; k < 6; k++)
		{
		  for(int i = 0; i < num.length - 1; i++)
		  {
	        if(num[i] > num[i+1]) 
		    {
			  int ex = num[i];
			  num[i] = num[i+1];
			  num[i+1] = ex;
		    }
		  }
		}
		
		
		for(int i = 0; i < num.length; i++)
		{
		System.out.println(num[i]);
		}
		
	}
}
