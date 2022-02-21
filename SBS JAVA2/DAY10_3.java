package DAY10;

import java.util.HashMap;

public class DAY10_3 {

	public static void main(String[] args) {
		
		// ArrayList -> 배열의 확장. 좀 더 사용성이 좋아진 배열. => 일괄처리, 반복문, 인덱스
		
		// HashMap -> 객체와 비슷. 데이터에 이름 붙여서 관리. => 구조화, 데이터 이름(키) - 데이터(벨류)

		
		// 사람 구조화
		
		// 1. 선언
		HashMap<String, String> PersonMap = new HashMap<>();
		
		// 2. 저장 - put(key,value);
		PersonMap.put("name","홍길동");
		PersonMap.put("age","20");
		
		// 3. 가져오기 
		String str1 = PersonMap.get("name");
		String str2 = PersonMap.get("age");
		
		System.out.println(str1);
		System.out.println(str2);
		
		// 4. 수정
		PersonMap.put("name", "이순신");
	    System.out.println(PersonMap.get("name"));
	    
	    // 5. 삭제
	    PersonMap.remove("name");
	    System.out.println(PersonMap.get("name"));
	    
	    // 6. 사이즈
	    System.out.println(PersonMap.size());
	    
	}
}
