package DAY4;

public class DAY4 {
public static void main(String args[]) {
	
	홍길동 a홍길동 = new 홍길동();
	
	홍길순 b홍길순 = new 홍길순();
	
	a홍길동.C프로그래밍();
	a홍길동.자바프로그래밍();
	b홍길순.파이썬프로그래밍();
		
	}	
}

class 홍길동{
	
	홍길순 b홍길순 = new 홍길순();
	
	void C프로그래밍() {
		b홍길순.C프로그래밍();
	}
	
	void 자바프로그래밍() {
		System.out.println("JAVA 18버전으로 프로그래밍 합니다.");
	}
}

class 홍길순 {
	void 파이썬프로그래밍() {
		System.out.println("파이썬 3.10 프로그래밍을 합니다.");		
	}
	
	void C프로그래밍() {
		System.out.println("C 표준1 프로그래밍을 합니다.");
	}
}