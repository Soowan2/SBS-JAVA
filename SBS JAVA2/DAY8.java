package DAY8;

public class DAY8 {
	public static void main(String args[]) {
		
		��� ö��1 = new ö��();
		ö��1.�ȴ�();
		
	}

}

//abstract class ���{
//
//	abstract void ������();
//	abstract void ��̻�Ȱ();
//	abstract void �ȴ�();
//}

// interface �� ��� �ż��尡 �߻�ż����ΰ�.
// interface ���{
	public void ������();
	public void ��̻�Ȱ();
	public void �ȴ�();	
}

// interface�� implements�� �޴´�.
class ö�� implements ���{
	
	public void ��̻�Ȱ(){
		System.out.println("���");
	}
	public void ������() {
		System.out.println("������");	
	}
	public void �ȴ�() {
		System.out.println("�ȴ�");	
	}
	
	
}