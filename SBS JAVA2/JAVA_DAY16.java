
public class JAVA_DAY16 {
	public static void main(String args[]) {
		
		
		// 객체란?
		// 데이터 + 함수 집합
		// 상태 + 동작 사물이나 개념
		// 클래스와 객체 -> 클래스 : 틀(개념적인것), 객체 : 실체
		// 자동차 -> 아우디, 아반떼, 모닝
		// 축구선수 -> 호날두, 손흥민, 메시
		// 음식 -> 짜장면, 피자, 탕수육
		
		// 개념을 정의, 설계 -> class 정의
		// 객체를 만들어줘
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.speed = 30;
		c1.model = "싼타페";
		c1.drive();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class Car{
	int speed;
	String model;
	
	public void drive() {		
		System.out.printf("%s가 %dkm의 속도로 달립니다.\n",model,speed);
	}
}