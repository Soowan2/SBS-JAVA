// ���� : ���� ��µǰ� ���ּ���.

class JAVA2_TEST2 {
	public static void main(String[] args) {
		Person3 p1 = new Person3();
		p1.setId(20);
		
		System.out.println("�� ��ȣ�� " + p1.getId() + " �Դϴ�.");
		// ��� : �� ��ȣ�� 20 �Դϴ�.
	}
}

class Person3 {
	// private => �ܺη� �������� �ʴ´�., �����ܿ� ������� �ʴ´�.
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}