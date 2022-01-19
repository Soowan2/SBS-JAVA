import java.util.Scanner;

public class JAVA_DAY6 {
	public static void main(String[] args) {
	    
	    // 출력
	    /*
	    높이 : [3]

	    *
	    **
	    ***


	    */

	    /*

	    높이 : [5]
	    
	    *
	    **
	    ***
	    ****
	    *****

	    */

	    /*

	    높이 : [7]

	    *
	    **
	    ***
	    ****
	    *****
	    ******
	    *******
	    
	    */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("높이를 입력하세요");
		
		int height = Integer.parseInt(scan.nextLine());
//		
//		for(int num = 1; num <= height; num++) 
//		{
//			
//			int num2 = 0;
//			
//			while(num != num2) 
//			{
//				
//			System.out.printf("*");
//			num2++;
//			
//			  if(num == num2) 
//			  {
//				System.out.printf("\n");
//			  }
//			
//			}
//			
//		}
		
		/*
		 * int height = 7;
		 * 
		 * for(int j = 1; j <= height ; j++)
		 * {
		 * for(int i = 1; i <= j; i++)
		 * {
		 * System.out.printf("*");
		 * }
		 * }

		 * */
		
		
		 // 출력
	    /*

	    높이 : [3]

	      *
	     **
	    ***
	    
	    */

	    /*

	    높이 : [5]

	        *
	       **
	      ***
	     ****
	    *****

	    */

	    /*

	    높이 : [7]

	          *
	         **
	        ***
	       ****
	      *****
	     ******
	    *******

	    */
		// 높이 - 1 만큼 공백 + *
		//높이 - 2 만큼 공백 + **
		
		
		 
		 for(int j = 1; j <= height ; j++)
		 {
		 for(int i = 1; i <= j; i++)
		 {
		 System.out.printf(" ");
		 }
		 System.out.printf("*");
		 
		 }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  }
	
	
}
