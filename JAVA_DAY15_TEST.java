
public class JAVA_DAY15_TEST {
	// 문제 : 자동차가 3번 달리게 해주세요.
		// 출력 : 자동차가 달립니다.
public static void main(String args[]) {
	


	    //v1. 1개의 자동차가 3번 달리게 해주세요.

	car c1 = new car();

	c1.num = 1;
	
	c1.run();

	
	    //v2. 3개의 자동차가 1번씩 달리게 해주세요.

	car c2 = new car();
	c2.num = 2;

	car c3 = new car();
	c3.num = 3;
	
	c1.run();
	c2.run();
	c3.run();
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	
	
}

}

class car{
	int num;
	
	public void run() {
		System.out.printf("%d번 자동차가 달립니다\n",num);
	}
	
	
}