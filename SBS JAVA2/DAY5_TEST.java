package DAY5;

//문제 : 아래와 같이 출력되도록 해주세요.
//조건 : 조건문을 사용하지 않고 처리해주세요.
//조건 : `a무기` 멤버 변수를 이용해서 풀어주세요.
//조건 : 칼, 창, 지팡이 클래스를 만들어주세요.

class DAY5_TEST {
public static void main(String[] args) {
 전사 a전사 = new 전사();
 
 a전사.공격(); 
 // 칼로 공격합니다.
 
 a전사.창_모드로_변경();
 a전사.공격();
 // 창으로 공격합니다.
 
 a전사.지팡이_모드로_변경();
 a전사.공격();
 // 지팡이로 공격합니다.
}
}
class 무기{
	void 공격(){
		System.out.println("칼로 공격합니다.");
	}
	
}

class 칼 extends 무기{
	void 공격() {
		System.out.println("칼로 공격합니다.");
	}
}
class 창 extends 무기{
	void 공격(){
		System.out.println("창으로 공격합니다.");
	}
}
class 지팡이 extends 무기{
	void 공격(){
		System.out.println("지팡이로 공격합니다.");
	}
}

class 전사 extends 무기{
	무기 a무기 = new 칼();
	void 공격(){
		a무기.공격();
	}
	void 창_모드로_변경() {
		a무기 = new 창();
	}
    void 지팡이_모드로_변경() {
    	a무기 = new 지팡이();
	}
}