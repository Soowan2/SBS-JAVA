
public class JAVA_DAY5_TEST {
	// n���� m������ ���� k�� ����� ������ �� ���ϱ�

	
	  public static void main(String[] args) {
	    
	   
		  
		  // ����. 1 ~ 100���� ���� ¦���� ���
		    //2
		    //4
		    //6
		    //8
		    //...
		    //100

		  
		  for(int count = 2; count < 101; count+=2)
		  {
			  System.out.printf("%d\n",count);
		  }
		  
		  
		    // ����. 1 ~ 100���� ���� ����ϴµ� ���� �ڿ� ¦���� even, Ȧ���� odd�� �ٿ��� ���
		    //1:odd
		    //2:even
		    //3:odd
		    //4:even
		    //5:odd
		    //6:even
		    //7:odd
		    //8:even
		    //...
		    //100:even
		  
		  for(int count = 1; count < 101; count++)
		  {
			  if(count % 2 == 1) {
				  System.out.printf("%d : odd\n",count);
			  }
			  else {
				  System.out.printf("%d : even\n",count);
			  }
		  }

		 
		// ���� �� : [3]
	    // �� �� : [20]
	    // ��� : [4]

	    // ��� : 60

		  int num1 = 0;
		  
		  for(int count = 3; count < 21; count += 1)
		  {
			  if(count % 4 == 0) {
			  num1 += count;
			  }
			  if(count == 20) {
				  System.out.printf("%d\n",num1);
			  }
		  }

	    // ���� �� : [5]
	    // �� �� : [30]
	    // ��� : [6]

	    // ��� : 84 (? ��� ���� �߸��ȵ��ϴ�)
		  
          int num2 = 0;
		  
		  for(int count = 5; count < 31; count += 1)
		  {
			  if(count % 6 == 0) {
			  num2 += count;
			  }
			  if(count == 30) {
				  System.out.printf("%d\n",num2);
			  }
		  }

		  
		// ���� : ������ �ۼ�
		// ���� : ¦����°�� ���ϱ�
		/* ��¿��� :

		  2 * 2 = 4
		  2 * 4 = 8
		  2 * 6 = 12
		  2 * 8 = 16
		  
		  ... 

		  9�ܱ��� �̷������� ������ �˴ϴ�.

		*/
		  int dan = 2;
		  
		  for(int count = 2; count < 10; count++)
		  {
			 
			 
			  if(count % 2 == 0) 
			    {
				  System.out.printf("%d x %d = %d\n",dan,count,dan*count);
			    }
			  
			  
			  if(count == 9) {
			  count = 0;
			  dan ++;
			  }
			  
			  if(dan == 10) {
				  break;
			  }
			  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	
}
