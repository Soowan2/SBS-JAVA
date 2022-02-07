
public class JAVA_DAY16 {
	
	// 데이터
	int a = 10; // 선언
	
	// a = 100; // 대입 연산
	
	// System.out.println("aaa"); // 문자열 정보 처리
	
	// 연산 및 처리 -> 함수
	
	
	// 사람이 사고하는 방식 -> 추상적인 사고
	// 사물을 볼 때 공통적인 점을 뽑아서 종합적 인식
	// 자동차 -> 다양한 종류가 있다
	// 자동차는 타이어로 움직이고. 브레이크 등등등
	
	static String name = "홍길동";
	static int age = 20;
	static double weight = 68.5;


	
public static void main(String args[]) {
	
	Car c1 = new Car();
	c1.modeL = "페라리";
	c1.speed = 200;
	c1.year = 2020;
	
	Car c2 = new Car();
	c2.modeL = "람보르기니";
	c2.speed = 190;
	c2.year = 2021;
	
	Car c3 = new Car();
	c3.modeL = "포르쉐";
	c3.speed = 180;
	c3.year = 2019;
	
	c1.run();
	c2.run();
	c3.run();
	
 
	
	
	}

}

class Car {
	
	String modeL;
	int speed;
	int year;
	
	public void run() {
		System.out.printf("자동차 %s가 %d의 속력으로 달립니다.\n",modeL,speed);
	}

	public void accel() {
	
	speed += 10; // 연산 및 처리
	
    }


	public void decel() {
	
	speed -= 10;
	
    }
	}