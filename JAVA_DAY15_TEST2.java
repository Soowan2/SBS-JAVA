// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.

public class JAVA_DAY15_TEST2 {
	public static void main(String[] args) {

		car c1 = new car();
		c1.high = 220;
		
		car c2 = new car();
		c2.high = 250;
		
		c1.run();
		c2.run();
		
	    // 출력 : 자동차가 최대속력 220km로 달립니다.
	    // 출력 : 자동차가 최대속력 250km로 달립니다.
	  }
}

class car{
	int high;
	public void run(){
		System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n",high);		
	}
}