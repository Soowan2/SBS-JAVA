package DAY10;

public class DAY10 {

	public static void main(String[] args) {
		������ a������ = new ������();
		String ����1 = "hello";
		
		Integer ����1 = 10;
		
//		��������� �����1 = new ���������();
//		����������� �����2 = new �����������();
//		��������� �����3 = new ���������();
		
		// �Ϲ�ȭ ���α׷���. ���ʸ�
		�����<Integer> �����4 = new �����<Integer>();
		�����<String> �����5 = new �����<String>();
		�����<������> �����6 = new �����<������>();
		
		�����4.����(����1);
		�����5.����(����1);
		�����6.����(a������);		
		
		// �迭�� ����� �� -> �ϰ�ó��
		// 1. Ÿ��(�ڷ���), 2. ����
		
		// 100�� ����. 57��° ������ ������ ���.
		Integer ����2 = �����4.�ּ���(0);
		String ����2 = �����5.�ּ���(0);
		������ b������ = �����6.�ּ���(0);
		
		b������.����Ÿ��();
		System.out.println(����2);
		System.out.println(����2);
		
	}
}

class �����<T> {

	T[] datas = (T[]) new Object[10];
	int size = 0;
	
	void ����(T o) {
		this.datas[size] = o;
		size++;
	}

	T �ּ���(int index) {
		return datas[index];
	}

}

class ������ {
	void ����Ÿ��() {
		System.out.println("�����̰� ������ ž�ϴ�.");
	}
}