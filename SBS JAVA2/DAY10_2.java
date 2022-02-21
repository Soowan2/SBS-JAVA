package DAY10;

import java.util.ArrayList;

public class DAY10_2 {

	public static void main(String[] args) {
		
		
		String[] strArr = new String[3];
		strArr[0] = "aaa";
		
		// 1. 선언
		ArrayList<String> strList = new ArrayList<String>();
		
		// 2. 저장 add();
		strList.add("aaa");
		strList.add("bbb");
		strList.add("ccc");
		strList.add("ddd");
		
		// 3. 가져오기  get(index);
		String str1 = strList.get(0);
		String str2 = strList.get(1);
		
		System.out.println(str1);
		System.out.println(str2);
		
		// 4. 수정  set(index, newValue);
		strArr[1] = "kkk";
		strList.set(2, "kkk");
		
		System.out.println(strList.get(2));
		
		// 5. 삭제
		strList.remove(1);
		System.out.println(strList.get(1));
		
		// 6. 데이터 개수
		int size = strList.size();
		System.out.println(size);
		strList.add("dsfsdf1");
		strList.add("dsfsdf2");
		
		size = strList.size();
		System.out.println(size);
		
		strList.remove(0);
		size = strList.size();
		System.out.println(size);
	}
}
