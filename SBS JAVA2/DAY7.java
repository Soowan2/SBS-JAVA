package DAY7;

public class DAY7 {
	
	public static void main(String args[]) {
		
		고양이 고양이1 = new 고양이(20);
		고양이1.야옹();
	    
		고양이 고양이2 = new 고양이();
		고양이2.나이 = 10;
		고양이2.야옹();
	}
	
}

class 동물 {
	protected int 나이;
	
	동물(){
		System.out.println("동물이 만들어집니다.");
	}
	
	void 숨쉬다() {
		System.out.println("숨쉬다");
	}
}

class 고양이 extends 동물 {
	
//	고양이(){
//		super(); //자신의 부모를 가리킴
//	}
	
	// 개수가 다르거나, 타입이 다르면 가능하다.
	// 오버로딩 : 같은 이름으로 메서드를 여러개 만드는것
	고양이(int 나이){
		초기화();
		this.나이 = 나이;
	}
	고양이(){
		초기화();
	}
	
	void 초기화() {
		System.out.println("고양이가 만들어집니다.");
	}
	
	void 야옹 () {
		System.out.printf("%d살 짜리 고양이가 야옹\n", 나이);
	}
}