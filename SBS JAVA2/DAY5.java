package DAY5;

public class DAY5 {
	public static void main(String args[]) {

		강아지 강아지1 = new 강아지();
		고양이 고양이1 = new 고양이();
		
		강아지1.숨쉬다();
		고양이1.숨쉬다();
		
		강아지1.멍멍();
		고양이1.야옹();

		
		
	}

}
class 동물{
	void 숨쉬다() {
		System.out.println("숨쉽니다.");
	}
}

class 강아지 extends 동물 {
	void 멍멍() {
		System.out.println("멍멍");
	}
}


class 고양이 extends 동물 {
	void 야옹() {
		System.out.println("야옹");
	}
}