package DAY10;

import java.util.HashMap;

public class DAY10_3 {

	public static void main(String[] args) {
		
		// ArrayList -> �迭�� Ȯ��. �� �� ��뼺�� ������ �迭. => �ϰ�ó��, �ݺ���, �ε���
		
		// HashMap -> ��ü�� ���. �����Ϳ� �̸� �ٿ��� ����. => ����ȭ, ������ �̸�(Ű) - ������(����)

		
		// ��� ����ȭ
		
		// 1. ����
		HashMap<String, String> PersonMap = new HashMap<>();
		
		// 2. ���� - put(key,value);
		PersonMap.put("name","ȫ�浿");
		PersonMap.put("age","20");
		
		// 3. �������� 
		String str1 = PersonMap.get("name");
		String str2 = PersonMap.get("age");
		
		System.out.println(str1);
		System.out.println(str2);
		
		// 4. ����
		PersonMap.put("name", "�̼���");
	    System.out.println(PersonMap.get("name"));
	    
	    // 5. ����
	    PersonMap.remove("name");
	    System.out.println(PersonMap.get("name"));
	    
	    // 6. ������
	    System.out.println(PersonMap.size());
	    
	}
}
