import java.util.Scanner;

public class JAVA_DAY9 {
	public static void main(String[] args) {
	
		// �迭 ����
		int[] arr = {1,2,3,4,5}; // index �� 4
		
		int a;
		a = 10;
		arr[2] = 10; // �迭�� ���Ҹ� ����(�ε���)�� �� ��� �������ֽø� �װ� �ϳ��� ���� ������ �Ѵ�.
		
		System.out.println(a);
		System.out.println(arr[2]);
		
		// �迭�� ���̰� �ִ�.
		// �迭�� ������ �Ѿ�� ������ ����.
		System.out.println(arr[4]);
		
		// �����͸� ���� �־�� �ϴ� ���
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		// ����� �Է°��� 5�� �ް� �ʹ�.
		int[] arr3 = {}; // 0��¥�� �迭
		
		// ���̸� �˷��ְ� ��ǻ������ �迭�� ������ �� �� �ִ�.
		int[] arr4 = new int[100]; // 100��¥�� �迭
		                           // 100���� 0�� ��������� �迭
		
		// ����� �Է��̳� ���Ͽ��� �о��.
		
		// �迭�� ������ ���� �ڷ���(Ÿ��)�� ���
        // int[] arr5 = {1,2,3,1.5,"abc"};
		
		// �迭 : �ڷ���, ����
		String[] arr6 = {"abc","bbc","ccc"};
		String[] arr7 = new String[5];
		double[] arr8 = {1.1,2.2,3.3};
		double[] arr9 = new double[5];
		
		// ���� -> �迭�� ���̸� �� ��
		
		// �迭�� ���̴� �迭�� �����Ѵ�.
		System.out.println(arr8.length); //�迭�� ���̸� �˷��ش�.
		
		// �迭�� ��ü Ž��
		for(int i = 0; i < arr8.length; i++) 
		{
			System.out.println(arr8[i]);
		}
		
		// �ڹ� API -> �ҷ��;���. import
		// import ����Ű : ���� ���� ����ϴ� ����Ű top 3
		// ctrl + shift + o
		Scanner scan = new Scanner(System.in); 
	
		String[] arr10 = new String[5]; // null�� ����		
		for(int i = 0; i < arr10.length; i++)
		{
		arr10[i] = scan.nextLine();
		}
		
		for(int i = 0; i < arr10.length; i++)
		{
		System.out.println(arr10[i]);
		}
		
		
	}
}
