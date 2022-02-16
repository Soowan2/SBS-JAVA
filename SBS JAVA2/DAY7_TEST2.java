package DAY7;

public class DAY7_TEST2 {
	public static void main(String[] args) {
	    
	    사람2 사람1 = new 철수();

	    사람1.팔다리를움직이다();
	    사람1.취미생활();
	    // 출력 : 팔다리를 움직입니다.
	    // 출력 : 철수가 축구를합니다.

	    사람2 사람2 = new 영희();

	    사람2.숨쉬다();
	    사람2.취미생활();
	    // 출력 : 숨을 쉽니다.
	    // 출력 : 영희가 독서를 합니다.
	    
	    사람2 사람3 = new 길동();
	    
	    사람3.잠자다();
	    사람3.취미생활();
	    // 출력 : 잡니다
	    // 출력 : 길동이 노래를 부릅니다.
	  }
}

abstract class 사람2 {
	  abstract void 취미생활();
	  
	  void 팔다리를움직이다() {
	    System.out.println("팔다리를 움직입니다.");
	  }

	  void 숨쉬다() {
	    System.out.println("숨을 쉽니다.");
	  }

	  void 잠자다() {
	    System.out.println("잡니다.");
	  }
	}

class 철수 extends 사람2 {
	void 취미생활() {
		System.out.println("철수가 축구를 합니다.");
	}
}

class 영희 extends 사람2 {
	void 취미생활() {
		System.out.println("영희가 독서를 합니다.");
	}
}

class 길동 extends 사람2 {
	void 취미생활() {
		System.out.println("길동이 노래를 부릅니다.");
	}	
}