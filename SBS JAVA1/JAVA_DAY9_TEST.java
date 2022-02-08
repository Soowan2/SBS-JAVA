import java.util.Scanner;

public class JAVA_DAY9_TEST {
	public static void main(String[] args) {
	    
	    // 문제 1 : arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
	  int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
	  for(int i = 0; i < arr1.length; i++)
	  {
		  System.out.println(arr1[i]);
	  }
	    // 문제 2 : 배열을 두번 출력해주세요.
	  
	  int[] arr2 = {1,2,3,4,5};
	  
	  for(int i = 0; i < arr2.length; i++)
	  {
		  System.out.println(arr2[i]);
	  }
	  
	  for(int i = 0; i < arr2.length; i++)
	  {
		  System.out.println(arr2[i]);
	  }
	  
	     // 문제 3 : 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.

	  Scanner scan = new Scanner(System.in);
	  
	  int[] arr3 = new int[5];
	  
	  for(int i = 0; i < arr3.length; i++)
	  {
		  arr3[i] = Integer.parseInt(scan.nextLine());
	  }
	  
	  for(int i = 0; i < arr3.length; i++)
	  {
		  System.out.println(arr3[i]);
	  }
	  
	    // 문제 4 : 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.  
	  
	  int[] arr4 = new int[5];
	  
	  for(int i = 0; i < arr4.length; i++)
	  {
		  arr4[i] = Integer.parseInt(scan.nextLine());
	  }
	  
	  for(int i = arr4.length - 1; i >= 0; i--)
	  {
		  System.out.println(arr4[i]);
	  }

	  
	  }
	
}
