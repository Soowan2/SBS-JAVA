package DAY9;

public class DAY9_2 {

	public static void main(String args[]) {
		������ a������ = new ������();
		String ����1 = "abcd";
		Integer ����1 = 10; 
		
		����� a����� = new �����();
		
		a�����.����(a������);
		a�����.����(����1);
		a�����.����(����1);
		
		������ b������ = (������)a�����.�ּ���(0);
		String ����2 = (String)a�����.�ּ���(1);
		Integer ����2 = (Integer)a�����.�ּ���(2);
		
		b������.����Ÿ��();
		System.out.println(����2);
		System.out.println(����2);
		
	}
}

class ����� {

	  Object[] datas = new Object[10];
	  int size = 0;
	  void ����(Object o) {		  
	    this.datas[size] = o;
	    size++;
	  }

	  Object �ּ���(int i) {
		  return datas[i];
	  }

	}
	class ������{
		void ����Ÿ��() {
			System.out.println("�����̰� ������ ž�ϴ�.");
		}
	}
