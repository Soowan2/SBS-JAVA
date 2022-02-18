package DAY9;

public class DAY9_2 {

	public static void main(String args[]) {
		원숭이 a원숭이 = new 원숭이();
		String 문자1 = "abcd";
		Integer 숫자1 = 10; 
		
		저장소 a저장소 = new 저장소();
		
		a저장소.저장(a원숭이);
		a저장소.저장(문자1);
		a저장소.저장(숫자1);
		
		원숭이 b원숭이 = (원숭이)a저장소.주세요(0);
		String 문자2 = (String)a저장소.주세요(1);
		Integer 숫자2 = (Integer)a저장소.주세요(2);
		
		b원숭이.나무타기();
		System.out.println(문자2);
		System.out.println(숫자2);
		
	}
}

class 저장소 {

	  Object[] datas = new Object[10];
	  int size = 0;
	  void 저장(Object o) {		  
	    this.datas[size] = o;
	    size++;
	  }

	  Object 주세요(int i) {
		  return datas[i];
	  }

	}
	class 원숭이{
		void 나무타기() {
			System.out.println("원숭이가 나무를 탑니다.");
		}
	}
