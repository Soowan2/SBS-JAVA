import java.util.Scanner;

public class JAVA_DAY9_TEST {
	public static void main(String[] args) {
	    
	    // ���� 1 : arr �迭�� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100�� �����ϰ� ������ּ���.
	  int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
	  for(int i = 0; i < arr1.length; i++)
	  {
		  System.out.println(arr1[i]);
	  }
	    // ���� 2 : �迭�� �ι� ������ּ���.
	  
	  int[] arr2 = {1,2,3,4,5};
	  
	  for(int i = 0; i < arr2.length; i++)
	  {
		  System.out.println(arr2[i]);
	  }
	  
	  for(int i = 0; i < arr2.length; i++)
	  {
		  System.out.println(arr2[i]);
	  }
	  
	     // ���� 3 : �迭�� �̿��� 5���� ���ڸ� �Է¹ް� ������ּ���.

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
	  
	    // ���� 4 : �迭�� 5���� ���� �Է��ϰ� �Ųٷ� ������ּ���.  
	  
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
