package DAY4;

class DAY4_TEST {
	  public static void main(String[] args) {
	    // 각 학생들에게 담임 선생님 정보를 저장하고 출력해주세요.

	    학생 s1 = new 학생(1, "홍길동", 20);
	    학생 s2 = new 학생(2, "홍길순", 21);

	    s1.introduce();
	    s1.teacher();
	    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.
	    s2.introduce();
	    s2.teacher2();
	    // 출력 : 안녕하세요 저는 2번 21살 홍길순이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
	    
	    
	    // 두 사람의 담임선생임이 바뀌었습니다. 아래와 같이 출력해주세요. 
        s1.introduce();
        s1.teacher2();
	    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
	    s2.introduce();
	    s2.teacher();
	    // 출력 : 안녕하세요 저는 2번 21살 홍길순이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.
	  }
	}

class 학생{
	private String name;
	private int age;
	private int num;
	
	public 학생 (int num,String name,int age) {
		this.name = name;
		this.num = num;
		this.age = age;
		
	}
	
	void introduce() {
		System.out.printf("안녕하세요 저는 %d번 %d살 %s이고요, ",num,age,name);
	}
	void teacher() {
		System.out.println("저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.");
	}
	void teacher2() {
		System.out.println("저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.");
	}
}

