package DAY7;

public class DAY7_TEST {
	 public static void main(String[] args) {
		    new 사람();
		    // 아래와 같이 출력되게 해주세요.
		    
		   
		    // 동물(String 이름, int 나이) 실행됨!
		    // 이름 : 홍길동
		    // 나이 : 27
		  }
}

class 동물1 {
	 
	  동물1(String 이름) {
	    System.out.println("동물(String 이름) 실행됨!");
	    System.out.println("이름 : " + 이름);
	  }
	  동물1(String 이름, int 나이) {
	    System.out.println("동물(String 이름, int 나이) 실행됨!");
	    System.out.println("이름 : " + 이름);
	    System.out.println("나이 : " + 나이);
	  }
	}

	class 사람 extends 동물1 {

		사람(){
			super("홍길동",27);
		}
	}