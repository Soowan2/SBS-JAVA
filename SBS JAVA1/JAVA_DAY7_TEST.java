import java.util.Scanner;

public class JAVA_DAY7_TEST {
 public static void main(String[] args) {
		 
		 // 문제 : 삼각형 만들기
		 
		 Scanner scan = new Scanner(System.in);
			System.out.println("높이를 입력하세요");
			
			int height = Integer.parseInt(scan.nextLine());
			
	
            
		

//			  for(int count = 1 ; count <= height  ;count++) // height 번 반복
//			  { 
//					
//				  for (int i = 1 ; i <= height - count ; i++  ) // height - count 번 반복
//				    {
//					System.out.printf(" ");
//					}
//					
//				  for (int j = 1; j <= count ; j++ ) // count 번 반복
//				    {
//					System.out.printf("*");
//					}
//					
//					System.out.println();
//					
//			  }

			  int plus = 0;
			  
			  for(int count = 1 ; count <= height  ;count++) // height 번 반복
			  { 
					
				  for (int i = 1 ; i <= height - count ; i++  ) // height - count 번 반복
				    {
					System.out.printf(" ");
					}
					
				  for (int j = 1; j <= count + plus ; j++ ) // count + plus 번 반복
				    {
					System.out.printf("*");
					}
				    plus++;
					System.out.println();
					
			  }

		
	 }
}
