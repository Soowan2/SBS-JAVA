
public class JAVA_DAY5_TEST {
	// n부터 m까지의 수중 k의 배수인 수들의 합 구하기

	
	  public static void main(String[] args) {
	    
	   
		  
		  // 문제. 1 ~ 100까지 수중 짝수만 출력
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
		  
		  
		    // 문제. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
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

		 
		// 시작 수 : [3]
	    // 끝 수 : [20]
	    // 배수 : [4]

	    // 결과 : 60

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

	    // 시작 수 : [5]
	    // 끝 수 : [30]
	    // 배수 : [6]

	    // 결과 : 84 (? 결과 값이 잘못된듯하다)
		  
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

		  
		// 문제 : 구구단 작성
		// 조건 : 짝수번째만 곱하기
		/* 출력예시 :

		  2 * 2 = 4
		  2 * 4 = 8
		  2 * 6 = 12
		  2 * 8 = 16
		  
		  ... 

		  9단까지 이런식으로 나오면 됩니다.

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
