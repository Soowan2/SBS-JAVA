
public class JAVA_DAY13 {
	 public static void showAllNumbersInArray(int[] arr) {
		 for(int i = 0; i < arr.length; i++)
		 {
		 System.out.printf("%d ",arr[i]);
		 }
	  }
	
	 public static int[] getEvenNumbers(int[] arr) {
		 
		 int count = 0;
		 int[] results = new int[count + 1];
		 
		 for(int i = 0; i < 10; i++)
		 {
		  if(arr[i] % 2 == 0)
		  {
			  results[count] = arr[i];
			  count++;
		  }
		 }
		 
	return results;
	  }  
public static void main(String[] args) {
	
//    int[] arr = {1,2,3,4,5,6,7,8,9,10};
//
//    showAllNumbersInArray(arr);

    // 출력
    // 1 2 3 4 5 6 7 8 9 10
	
	
    
    int[] arr = {2, 5, 7, 8, 12, 23, 26, 128, 177 ,201};
    int[] result = getEvenNumbers(arr);

    for(int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
    }

    // 출력 : 2, 8, 12, 26, 128
	
	
	
	
	
	
}
}
