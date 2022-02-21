package DAY10;

public class DAY10 {

	public static void main(String[] args) {
		원숭이 a원숭이 = new 원숭이();
		String 문자1 = "hello";
		
		Integer 숫자1 = 10;
		
//		정수저장소 저장소1 = new 정수저장소();
//		원숭이저장소 저장소2 = new 원숭이저장소();
//		문자저장소 저장소3 = new 문자저장소();
		
		// 일반화 프로그래밍. 제너릭
		저장소<Integer> 저장소4 = new 저장소<Integer>();
		저장소<String> 저장소5 = new 저장소<String>();
		저장소<원숭이> 저장소6 = new 저장소<원숭이>();
		
		저장소4.저장(숫자1);
		저장소5.저장(문자1);
		저장소6.저장(a원숭이);		
		
		// 배열을 사용할 때 -> 일괄처리
		// 1. 타입(자료형), 2. 길이
		
		// 100개 저장. 57번째 데이터 꺼내서 사용.
		Integer 숫자2 = 저장소4.주세요(0);
		String 문자2 = 저장소5.주세요(0);
		원숭이 b원숭이 = 저장소6.주세요(0);
		
		b원숭이.나무타기();
		System.out.println(문자2);
		System.out.println(숫자2);
		
	}
}

class 저장소<T> {

	T[] datas = (T[]) new Object[10];
	int size = 0;
	
	void 저장(T o) {
		this.datas[size] = o;
		size++;
	}

	T 주세요(int index) {
		return datas[index];
	}

}

class 원숭이 {
	void 나무타기() {
		System.out.println("원숭이가 나무를 탑니다.");
	}
}