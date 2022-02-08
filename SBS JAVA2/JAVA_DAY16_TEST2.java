// 회원 모델링 : 이름, 나이, 주소

public class JAVA_DAY16_TEST2 {
	public static void main(String[] args) {

	    Customer c1 = new Customer();
	    c1.name = "김짱구";
	    c1.age = 35;
	    c1.address = "대전";

	    Customer c2 = new Customer();
	    c2.name = "손흥민";
	    c2.age = 29;
	    c2.address = "런던";

	    Customer c3 = new Customer();
	    c3.name = "홍길동";
	    c3.age = 26;
	    c3.address = "서울";

	    Customer c4 = new Customer();
	    c4.name = "김서방";
	    c4.age = 44;
	    c4.address = "대전";

//	    Customer[] cus = new Customer[4];
//	    
//	    cus[0] = c1;
//	    cus[1] = c2;
//	    cus[2] = c3;
//	    cus[3] = c4;
	    
	    Customer[] cus = {c1, c2, c3, c4};
	    
	    
	    //1. 전체 회원 나이와 이름 출력
	    for(int i = 0; i < cus.length; i++)
	    {
	    	cus[i].age();
	    	cus[i].name();
	    }
	    //2. 나이가 30세 미만인 사람의 이름 출력
	    for(int i = 0; i < cus.length; i++)
	    {
	    	if(cus[i].age < 30)
	    	{
	    	cus[i].name();
	    	}
	    }
	    //3. 대전 사는 사람들의 이름과 나이 출력
	    for(int i = 0; i < cus.length; i++)
	    {
	    	if(cus[i].address == "대전")
	    	{
	    	cus[i].name();
	    	cus[i].age();
	    	}
	    }
	    //4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)
	    // 비교대상문자열.startsWith("체크할문자열")
	    for(int i = 0; i < cus.length; i++)
	    {
	    	if(cus[i].name.startsWith("김"))
	    	{
	    	cus[i].name();
	    	}
	    }


	  }
}

class Customer{
	
	String name;
	int age;
	String address;
	
	public void name() {
		System.out.printf("이름 : %s\n",name);	
	}
	public void age() {
		System.out.printf("나이 : %d\n",age);	
	}
	public void address() {
		System.out.printf("주소 : %s\n",address);	
	}
	
}