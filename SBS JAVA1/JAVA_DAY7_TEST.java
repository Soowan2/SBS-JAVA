import java.util.Scanner;

public class JAVA_DAY7_TEST {
 public static void main(String[] args) {
		 
		 // ���� : �ﰢ�� �����
		 
		 Scanner scan = new Scanner(System.in);
			System.out.println("���̸� �Է��ϼ���");
			
			int height = Integer.parseInt(scan.nextLine());
			
	
            
		

//			  for(int count = 1 ; count <= height  ;count++) // height �� �ݺ�
//			  { 
//					
//				  for (int i = 1 ; i <= height - count ; i++  ) // height - count �� �ݺ�
//				    {
//					System.out.printf(" ");
//					}
//					
//				  for (int j = 1; j <= count ; j++ ) // count �� �ݺ�
//				    {
//					System.out.printf("*");
//					}
//					
//					System.out.println();
//					
//			  }

			  int plus = 0;
			  
			  for(int count = 1 ; count <= height  ;count++) // height �� �ݺ�
			  { 
					
				  for (int i = 1 ; i <= height - count ; i++  ) // height - count �� �ݺ�
				    {
					System.out.printf(" ");
					}
					
				  for (int j = 1; j <= count + plus ; j++ ) // count + plus �� �ݺ�
				    {
					System.out.printf("*");
					}
				    plus++;
					System.out.println();
					
			  }

		
	 }
}
