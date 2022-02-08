import java.util.Scanner;

public class JAVA_DAY9 {
	public static void main(String[] args) {
	
		// 배열 선언
		int[] arr = {1,2,3,4,5}; // index 는 4
		
		int a;
		a = 10;
		arr[2] = 10; // 배열의 원소를 순번(인덱스)로 콕 집어서 선택해주시면 그건 하나의 변수 역할을 한다.
		
		System.out.println(a);
		System.out.println(arr[2]);
		
		// 배열은 길이가 있다.
		// 배열의 범위를 넘어가면 에러가 난다.
		System.out.println(arr[4]);
		
		// 데이터를 많이 넣어야 하는 경우
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		// 사용자 입력값을 5개 받고 싶다.
		int[] arr3 = {}; // 0개짜리 배열
		
		// 길이를 알려주고 컴퓨터한테 배열을 만들라고 할 수 있다.
		int[] arr4 = new int[100]; // 100개짜리 배열
		                           // 100개의 0이 만들어지는 배열
		
		// 사용자 입력이나 파일에서 읽어옴.
		
		// 배열은 무조건 같은 자료형(타입)만 취급
        // int[] arr5 = {1,2,3,1.5,"abc"};
		
		// 배열 : 자료형, 길이
		String[] arr6 = {"abc","bbc","ccc"};
		String[] arr7 = new String[5];
		double[] arr8 = {1.1,2.2,3.3};
		double[] arr9 = new double[5];
		
		// 길이 -> 배열의 길이를 모를 때
		
		// 배열의 길이는 배열이 제공한다.
		System.out.println(arr8.length); //배열의 길이를 알려준다.
		
		// 배열을 전체 탐색
		for(int i = 0; i < arr8.length; i++) 
		{
			System.out.println(arr8[i]);
		}
		
		// 자바 API -> 불러와야함. import
		// import 단축키 : 가장 많이 사용하는 단축키 top 3
		// ctrl + shift + o
		Scanner scan = new Scanner(System.in); 
	
		String[] arr10 = new String[5]; // null로 세팅		
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
