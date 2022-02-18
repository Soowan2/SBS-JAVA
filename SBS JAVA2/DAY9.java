package DAY9;
//문제 : 저장소에 다양한 자료들을 저장하고 다시 받아서 사용해보세요.
public class DAY9 {
	public static void main(String[] args) {
		
		// 구현 시작
    저장소 a저장소 = new 저장소();

    a저장소.저장("안녕");

    // Object s = a저장소.주세요();
    String s = (String)a저장소.주세요();
    System.out.println(s);
    // 출력 : 안녕

    a저장소.저장(11);

    // Object i = a저장소.주세요();
    int i = (int)a저장소.주세요();
    System.out.println(i);
    //출력 : 11
    
    원숭이 a원숭이 = new 원숭이();
    
    a저장소.저장(a원숭이);

    // Object b원숭이 = a저장소.주세요();
    원숭이 b원숭이 = (원숭이)a저장소.주세요();
    b원숭이.나무타기();
    // 출력 : 원숭이가 나무를 탑니다.
	}

}

//class 저장소 {
//
//  Object data;
//
//  void 저장(Object o) {
//    this.data = o;
//  }
//
//  Object 주세요() {
//	  return data;
//  }
//
//}
//class 원숭이{
//	void 나무타기() {
//		System.out.println("원숭이가 나무를 탑니다.");
//	}
//}
