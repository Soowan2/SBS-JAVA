import java.util.Scanner;

public class JAVA_DAY6 {
	public static void main(String[] args) {
	    
	    // ���
	    /*
	    ���� : [3]

	    *
	    **
	    ***


	    */

	    /*

	    ���� : [5]
	    
	    *
	    **
	    ***
	    ****
	    *****

	    */

	    /*

	    ���� : [7]

	    *
	    **
	    ***
	    ****
	    *****
	    ******
	    *******
	    
	    */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		
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
		
		
		 // ���
	    /*

	    ���� : [3]

	      *
	     **
	    ***
	    
	    */

	    /*

	    ���� : [5]

	        *
	       **
	      ***
	     ****
	    *****

	    */

	    /*

	    ���� : [7]

	          *
	         **
	        ***
	       ****
	      *****
	     ******
	    *******

	    */
		// ���� - 1 ��ŭ ���� + *
		//���� - 2 ��ŭ ���� + **
		
		
		 
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
