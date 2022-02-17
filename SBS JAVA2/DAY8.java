package DAY8;

public class DAY8 {
	public static void main(String args[]) {
		
		사람 철수1 = new 철수();
		철수1.걷다();
		
	}

}

//abstract class 사람{
//
//	abstract void 숨쉬다();
//	abstract void 취미생활();
//	abstract void 걷다();
//}

// interface 는 모든 매서드가 추상매서드인것.
// interface 사람{
	public void 숨쉬다();
	public void 취미생활();
	public void 걷다();	
}

// interface는 implements로 받는다.
class 철수 implements 사람{
	
	public void 취미생활(){
		System.out.println("취미");
	}
	public void 숨쉬다() {
		System.out.println("숨쉬다");	
	}
	public void 걷다() {
		System.out.println("걷다");	
	}
	
	
}