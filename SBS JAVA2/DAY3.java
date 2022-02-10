
public class DAY3 {
	public static void main(String args[]) {
		
		
		dog a1 = new dog();
		cat a2 = new cat();
		
		a1.bark();
		a1.baby();
		a1.move();
		a2.bark();
		a2.move();
		a2.baby();
		
		// 상속 -> 코드를 물려준다. -> 코드 재사용
		
	}

}
class animal{
	void move() {
		System.out.println("움직입니다");
	}
	void baby() {
		System.out.println("새끼를 낳습니다.");
	}
}

class dog extends animal {

	void bark() {
		System.out.println("멍멍");
	}

}

class cat extends animal {
	
	void bark() {
		System.out.println("야옹");
	}

}