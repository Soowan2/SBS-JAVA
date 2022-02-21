package DAY10;
import java.util.ArrayList;
public class DAY10_TEST2 {
	public static void main(String[] args) {

		// 선언
		// 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
		
		ArrayList<String> arrList = new ArrayList<String>(); 




		// add()
		// 리스트에 값을 추가해주세요.
		// "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
		
		
		arrList.add("홍길동");
		arrList.add("이순신");
		arrList.add("황진이");
		arrList.add("임꺽정");
		arrList.add("강감찬");
		arrList.add("을지문덕");
		

				

		// size()
		// 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
		// 출력결과 : 6
		System.out.println("=====================");
		int size = arrList.size();
		System.out.println(size);



		// get()
		// 리스트의 2,3 인덱스의 값을 출력해주세요.
		// 출력결과 : 황진이, 임꺽정
		System.out.println("=====================");
		String p1 = arrList.get(2);
		String p2 = arrList.get(3);
		
		System.out.println(p1);
		System.out.println(p2);




		
		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕
		System.out.println("=====================");
		for(int i = 0; i < size; i++)
		{
			String p = arrList.get(i);
			System.out.println(p);
		}
	
	


		
		// remove()
		// 리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
		// 출력 결과 : 강감찬, 을지문덕
		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("홍길동"))
			{
				arrList.remove(i);
			}
		}
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("이순신"))
			{
				arrList.remove(i);
			}
		}
		
		System.out.println(arrList.get(2));
		System.out.println(arrList.get(3));

		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 황진이 임꺽정 강감찬 을지문덕
		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println(arrList.get(i));
		}
    



		// add()
		// 리스트에 정약용을 추가시켜주세요.
		System.out.println("=====================");
		
		arrList.add("정약용");



		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용

		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println(arrList.get(i));
		}
    



		// set()
		// 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.

		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("임꺽정"))
			{
				arrList.set(i, "신사임당");
			}
		}
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("을지문덕"))
			{
				arrList.set(i, "유관순");
			}
		}
		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 황진이 신사임당 강감찬 유관순 정약용

		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println(arrList.get(i));
		}
    

		// 리스트에서 황진이 신사임당 유관순만 출력해주세요.
		// 출력 결과 : 황진이 신사임당 유관순
		System.out.println("=====================");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			String p = arrList.get(i);
			if(p.equals("황진이"))
			{
				System.out.println(arrList.get(i));
			}
			else if(p.equals("신사임당"))
			{
				System.out.println(arrList.get(i));
			}
			else if(p.equals("유관순"))
			{
				System.out.println(arrList.get(i));
			}
		}

	}

}
