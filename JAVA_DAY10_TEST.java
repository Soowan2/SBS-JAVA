import java.util.Scanner;
import java.util.Random;

public class JAVA_DAY10_TEST {
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1�� ��÷ ��ȣ
        int length = lottoNums.length;

        // �Ʒ��� ���� ����� ��µǵ��� �ζ� ��÷ ��ȣ 7��(���ʽ� ��ȣ ����)�� �������ּ���.
        // 1. ���⿡ ��÷ ��ȣ ���� �ڵ� �ۼ����ּ���.
        // ** �ߺ��� ��ȣ�� ����� ��.
        // ======================================================================================           
        for(int i = 0; i <= 6; i++)
    		{
    			lottoNums[i] = random.nextInt(44) + 1; // 1 ~ 45 ���� �̱�

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
       
       // ���� ������� ������ ��ȣ�߿� ���� ���� ��ȣ�� �����Ѱ� �ִ°�? 
       // ������?? continue;
       
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
       
       lottoNums[count] = no; // ���� ��ȣ ����
       count++;
       
       if(count == 7)
       {
       break;
       }
       
       }
         
         for(int i = 0; i < length - 1; i++){
         System.out.printf("%d ", lottoNums[i]);
         }
         System.out.printf("���ʽ� ��ȣ : %d\n", lottoNums[length - 1]);
         
        
         
          */
        // ======================================================================================


        // 1 ��� �ڵ�
        // ======================================================================================
        System.out.printf("��÷ ��ȣ : ");
        
        for(int i = 0; i < 6; i++) {
        
        	System.out.printf("%d, ",lottoNums[i]);
        	
        }
        
        System.out.printf("���ʽ� ��ȣ : %d", lottoNums[6]);


        // ======================================================================================

        // ��°��
        // ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36
	}
}
