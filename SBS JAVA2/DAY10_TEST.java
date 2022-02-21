package DAY10;

import java.util.ArrayList;

public class DAY10_TEST {
	public static void main(String[] args) {

		// 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
		// 리스트에 값을 추가해주세요.
		
		ArrayList intList = new ArrayList();

		intList.add(1);
		intList.add(3);
		intList.add(3);
		intList.add(2);
		intList.add(1);
		intList.add(0);

		// size()
		// 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
		// 출력결과 : 6
		System.out.println("==========================");	

		int size = intList.size();
		System.out.println(size);

		// get()
		// 리스트의 3,4번째 값을 출력해주세요.
		// 출력결과 : 3, 2
		System.out.println("==========================");	

		Object rd = intList.get(2);
		Object th = intList.get(3);

		System.out.println(rd);
		System.out.println(th);

		// remove()
		// 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
		// 출력 결과 : 1, 0
		System.out.println("==========================");	
		
		intList.remove(0);
		intList.remove(1);

		rd = intList.get(2);
		th = intList.get(3);

		System.out.println(rd);
		System.out.println(th);

		// 반복문으로 출력.
		//
		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 3, 2, 1, 0
		System.out.println("==========================");	
		
		for (int i = 0; i < intList.size(); i++)
		{
			Object num = intList.get(i);
			System.out.println(num);
		}
	}
}
