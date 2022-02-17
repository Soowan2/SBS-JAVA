package DAY8;

public class DAY8_2 {
	public static void main(String args[]) {
		
		소나타 소나타1 = new 소나타();
		싼타페 싼타페1 = new 싼타페();
		
//		소나타1.주행();
//		소나타1.크루즈();
//		
//		싼타페1.주행();
//		싼타페1.사륜모드();
		
		자동차 자동차1 = 소나타1;
		
		자동차1.주행();
		
		// 상위클래스가 하위클래스로 모습을 바꾸는건 명시적 형변환을 해주면 된다.
		싼타페 싼타페2 = (싼타페)자동차1;
		
	}

}

abstract class 자동차{
	abstract void 주행();
	
}

class 소나타 extends 자동차 {
	void 주행() {
		System.out.println("무난하게 주행합니다.");
	}
	
	void 크루즈() {
		System.out.println("일정한 속도를 유지합니다.");
	}
}

class 싼타페 extends 자동차 {
	void 주행() {
		System.out.println("묵직하게 주행합니다.");
	}
	
	void 사륜모드() {
		System.out.println("사륜 주행합니다.");
	}
}