package DAY8;
//문제 : 자동차 리모콘으로 페라리 객체를 연결한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하여 페라리의 고유 기능을 사용할 수 있도록 코드를 작성해주세요.

public class DAY8_TEST {
	public static void main(String[] args) {
	    자동차1 a자동차 = new 페라리();
	    페라리 a페라리 = (페라리)a자동차;
	    a페라리.뚜껑열기();
	    // 출력 : 페라리의 뚜껑이 열립니다.
		}
}

class 자동차1 {
	  void 달리다() {
	    System.out.println("자동차가 달립니다.");
	  }
	}

class 페라리 extends 자동차1 {
	void 뚜껑열기() {
		System.out.println("페라리의 뚜껑이 열립니다.");
	}
}