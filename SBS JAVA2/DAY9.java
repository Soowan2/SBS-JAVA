package DAY9;
//���� : ����ҿ� �پ��� �ڷ���� �����ϰ� �ٽ� �޾Ƽ� ����غ�����.
public class DAY9 {
	public static void main(String[] args) {
		
		// ���� ����
    ����� a����� = new �����();

    a�����.����("�ȳ�");

    // Object s = a�����.�ּ���();
    String s = (String)a�����.�ּ���();
    System.out.println(s);
    // ��� : �ȳ�

    a�����.����(11);

    // Object i = a�����.�ּ���();
    int i = (int)a�����.�ּ���();
    System.out.println(i);
    //��� : 11
    
    ������ a������ = new ������();
    
    a�����.����(a������);

    // Object b������ = a�����.�ּ���();
    ������ b������ = (������)a�����.�ּ���();
    b������.����Ÿ��();
    // ��� : �����̰� ������ ž�ϴ�.
	}

}

//class ����� {
//
//  Object data;
//
//  void ����(Object o) {
//    this.data = o;
//  }
//
//  Object �ּ���() {
//	  return data;
//  }
//
//}
//class ������{
//	void ����Ÿ��() {
//		System.out.println("�����̰� ������ ž�ϴ�.");
//	}
//}
