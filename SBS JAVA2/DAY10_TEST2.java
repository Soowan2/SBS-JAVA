package DAY10;
import java.util.ArrayList;
public class DAY10_TEST2 {
	public static void main(String[] args) {

		// ����
		// �̸��� ������ �� �ִ� ArrayList�� �����ϰ� ������ּ���.
		
		ArrayList<String> arrList = new ArrayList<String>(); 




		// add()
		// ����Ʈ�� ���� �߰����ּ���.
		// "ȫ�浿", "�̼���", "Ȳ����", "�Ӳ���", "������", "��������" �� ArrayList�� �߰� ���ּ���.
		
		
		arrList.add("ȫ�浿");
		arrList.add("�̼���");
		arrList.add("Ȳ����");
		arrList.add("�Ӳ���");
		arrList.add("������");
		arrList.add("��������");
		

				

		// size()
		// ����Ʈ�� ����� ������ֽð�, ���� 6�� �´ٸ� ��� �������ּ���.
		// ��°�� : 6
		System.out.println("=====================");
		int size = arrList.size();
		System.out.println(size);



		// get()
		// ����Ʈ�� 2,3 �ε����� ���� ������ּ���.
		// ��°�� : Ȳ����, �Ӳ���
		System.out.println("=====================");
		String p1 = arrList.get(2);
		String p2 = arrList.get(3);
		
		System.out.println(p1);
		System.out.println(p2);




		
		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : ȫ�浿 �̼��� Ȳ���� �Ӳ��� ������ ��������
		System.out.println("=====================");
		for(int i = 0; i < size; i++)
		{
			String p = arrList.get(i);
			System.out.println(p);
		}
	
	


		
		// remove()
		// ����Ʈ���� ȫ�浿, �̼����� ���� ��, �ٽ� 2,3 �ε����� ���� ������ֽð� � ��ȭ�� �ִ��� üũ���ּ���.
		// ��� ��� : ������, ��������
		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("ȫ�浿"))
			{
				arrList.remove(i);
			}
		}
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("�̼���"))
			{
				arrList.remove(i);
			}
		}
		
		System.out.println(arrList.get(2));
		System.out.println(arrList.get(3));

		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : Ȳ���� �Ӳ��� ������ ��������
		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println(arrList.get(i));
		}
    



		// add()
		// ����Ʈ�� ������� �߰������ּ���.
		System.out.println("=====================");
		
		arrList.add("�����");



		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : Ȳ���� �Ӳ��� ������ �������� �����

		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println(arrList.get(i));
		}
    



		// set()
		// �Ӳ����� ���������� �Ż��Ӵ�� ���������� �ٲ��ּ���.

		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("�Ӳ���"))
			{
				arrList.set(i, "�Ż��Ӵ�");
			}
		}
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("��������"))
			{
				arrList.set(i, "������");
			}
		}
		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : Ȳ���� �Ż��Ӵ� ������ ������ �����

		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println(arrList.get(i));
		}
    

		// ����Ʈ���� Ȳ���� �Ż��Ӵ� �������� ������ּ���.
		// ��� ��� : Ȳ���� �Ż��Ӵ� ������
		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("Ȳ����"))
			{
				System.out.println(arrList.get(i));
			}
			else if(p.equals("�Ż��Ӵ�"))
			{
				System.out.println(arrList.get(i));
			}
			else if(p.equals("������"))
			{
				System.out.println(arrList.get(i));
			}
		}

	}

}
