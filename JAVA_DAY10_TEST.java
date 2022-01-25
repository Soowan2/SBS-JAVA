import java.util.Scanner;
import java.util.Random;

public class JAVA_DAY10_TEST {
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1등 당첨 번호
        int length = lottoNums.length;

        // 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
        // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
        // ** 중복된 번호는 없어야 됨.
        // ======================================================================================           
        for(int i = 0; i <= 6; i++)
    		{
    			lottoNums[i] = random.nextInt(44) + 1; // 1 ~ 45 랜덤 뽑기

for ( int j  = 0; j < 6; j++ ) 
{
	if(i <= j) 
	{
	break;
	}
	
 for ( int k = 1; k <= 6; k++)
 {
	if(i < k) 
	{
		break;
	}
	
     if ( i > j && lottoNums[i] == lottoNums[i - k]) 
     {
    				lottoNums[i] = random.nextInt(44) + 1;
     }
 }

}		
//    			if(i > 0 && lottoNums[i] == lottoNums[i-1]) {
//    				lottoNums[i] = random.nextInt(44) + 1;
//    			}
//    			
//    			if(i > 1 && lottoNums[i] == lottoNums[i-2]) {
//    				lottoNums[i] = random.nextInt(44) + 1;
//    			}
//    			
//    			if(i > 2 && lottoNums[i] == lottoNums[i-3]) {
//    				lottoNums[i] = random.nextInt(44) + 1;
//    			}
//    			
//    			if(i > 3 && lottoNums[i] == lottoNums[i-4]) {
//    				lottoNums[i] = random.nextInt(44) + 1;
//    			}
//    			
//    			if(i > 4 && lottoNums[i] == lottoNums[i-5]) {
//    				lottoNums[i] = random.nextInt(44) + 1;
//    			}
//    			
//    			if(i > 5 && lottoNums[i] == lottoNums[i-6]) {
//    				lottoNums[i] = random.nextInt(44) + 1;
//    			}
//    		}

        /*
       int count = 0;
       
       while(true)
       {
       int no = random.nextInt(44) + 1; // 
       
       // 내가 현재까지 저장한 번호중에 지금 뽑힌 번호랑 동일한게 있는가? 
       // 있으면?? continue;
       
       for(int j = 0; j < length; j++)
       {
       
       int myno = lottoNums[j];
       
       if(no == myno)
       {
       no = -1;
       break;
       }
       
       }
       
       if(no == -1)
       {
       continue;
       }
       
       lottoNums[count] = no; // 뽑은 번호 저장
       count++;
       
       if(count == 7)
       {
       break;
       }
       
       }
         
         for(int i = 0; i < length - 1; i++){
         System.out.printf("%d ", lottoNums[i]);
         }
         System.out.printf("보너스 번호 : %d\n", lottoNums[length - 1]);
         
        
         
          */
        // ======================================================================================


        // 1 출력 코드
        // ======================================================================================
        System.out.printf("당첨 번호 : ");
        
        for(int i = 0; i < 6; i++) {
        
        	System.out.printf("%d, ",lottoNums[i]);
        	
        }
        
        System.out.printf("보너스 번호 : %d", lottoNums[6]);


        // ======================================================================================

        // 출력결과
        // 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36
	}
}
