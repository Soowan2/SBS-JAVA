package DAY10;

import java.util.ArrayList;

public class DAY10_TEST {
	public static void main(String[] args) {

		// ������ ������ �� �ִ� ArrayList�� �����ϰ� ������ּ���.
		// ����Ʈ�� ���� �߰����ּ���.
		
		ArrayList intList = new ArrayList();

		intList.add(1);
		intList.add(3);
		intList.add(3);
		intList.add(2);
		intList.add(1);
		intList.add(0);

		// size()
		// ����Ʈ�� ����� ������ֽð�, ���� 6�� �´ٸ� ��� �������ּ���.
		// ��°�� : 6
		System.out.println("==========================");	

		int size = intList.size();
		System.out.println(size);

		// get()
		// ����Ʈ�� 3,4��° ���� ������ּ���.
		// ��°�� : 3, 2
		System.out.println("==========================");	

		Object rd = intList.get(2);
		Object th = intList.get(3);

		System.out.println(rd);
		System.out.println(th);

		// remove()
		// ����Ʈ�� 1,2��° ���� ���� ��, �ٽ� 3,4��° ���� ������ֽð� � ��ȭ�� �ִ��� üũ���ּ���.
		// ��� ��� : 1, 0
		System.out.println("==========================");	
		
		intList.remove(0);
		intList.remove(1);

		rd = intList.get(2);
		th = intList.get(3);

		System.out.println(rd);
		System.out.println(th);

		// �ݺ������� ���.
		//
		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : 3, 2, 1, 0
		System.out.println("==========================");	
		
		for (int i = 0; i < intList.size(); i++)
		{
			Object num = intList.get(i);
			System.out.println(num);
		}
	}
}
