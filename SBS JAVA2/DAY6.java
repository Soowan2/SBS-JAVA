package DAY6;

/* ����
�츮�� ���Ӱ���ȸ�翡 �Ի��ߴ�.
�츮���Դ� �������� ��� �Ѹ��� �ִ�.
���� ������ ������ �����ùķ��̼� �����̴�.
������ ���� ������ �������� ������ ������ ���ش�.
*/

/* �䱸����
- D1 �䱸 : ������ �����ϰ� �����Ͻÿ�.
- D1 �Ϸ� : Ŭ������ �޼��带 ���� ó��
- D2 �䱸 : ������ �������� �츮�� ���ؼ� `û�տ���`�� `�����`�� �����ϰ� �����Ͻÿ�.
- D2 �Ϸ� : Ŭ������ �޼��带 ���� ó��
- D3 �䱸 : ���� �迭�� Ŭ������ ���� �޼��尡 �ߺ��Ǿ����ϴ�. �ߺ��� �������ּ���.
- D3 �Ϸ� : ����� ����ؼ� ó��
- D4 �䱸 : ������ ��̸� ���Ͽ� ���������� �߰��ϰ� ���� �Ͻÿ�.
- D4 �Ϸ� : Ŭ������ �޼��带 ���� ó��
- D5 �䱸 : �ָ� ����ȸ�ǿ��� ���������� �ϴ��� ���ƴٴϴ� �Ϳ� ���ؼ� ��Ŭ�� ���Խ��ϴ�. �������� �迭�� �ϴ��� �� �� ���� ���ּ���.
- D5 �Ϸ� : �޼��� �������̵带 ����ؼ� ó��
- D6 �䱸 : ���������� ������ �����ϴ�. ����2������ �߰��ϰ� ���� ���ּ���.
- D6 �Ϸ� : ����2���� �߰��� �������� ������� �ذ�
- D7 �䱸 : ���ο� ����� ���ġ�⸦ �߰��ϰ� ����ó�� ���� ��������ó�� ���ġ�� �Ƽ��� ������ �߰����ּ���.
*/

class DAY6 {
	public static void main(String[] args) {

		û�տ��� aû�տ��� = new û�տ���();
		����� a����� = new �����();
		�������� a�������� = new ��������();
		����2���� a����2���� = new ����2����();
		�Ƽ������ a�Ƽ������ = new �Ƽ������();
		
		����[] ������ = {aû�տ���, a�����, a��������, a����2����, a�Ƽ������};
		
		for(int i = 0; i < ������.length; i++)
		{
			������[i].����();
			������[i].���ġ��();
		}
		
	}
}

// �߻�Ŭ���� -> �ݵ�� Ư�� �޼��带 �������̵��ϰ� �ϱ� ����.
abstract class ���� {
	abstract void ���(); // ��¥�Լ�
}

class �Ϲݳ��� extends ���� {
	void ���() {
		System.out.println("������ ������ ���ư��ϴ�.");
	}
}

class �������� extends ���� {
	void ���() {
		System.out.println("�� �� �����. �̤�");
	}
}

abstract class �� {
	abstract void ���();
}

class �Ϲݹ� extends �� {
	void ���() {
		System.out.println("������ �����߷� ���Ĩ�ϴ�.");
	}
}

class ������ extends �� {
	void ���() {
		System.out.println("������ �յ� ���ٴմϴ�.");
	}
}

class ���� {

	protected ���� a���� = new �Ϲݳ���();
	protected �� a�� = new �Ϲݹ�();

	void ����() {
		a����.���();
	}

	void ���ġ��() {
		a��.���();
	}
}

class ����� extends ���� {
	�����() {
		a���� = new �Ϲݳ���(); // ���� ����
		a�� = new �Ϲݹ�();
	}
}

class û�տ��� extends ���� {
	û�տ���() {
		a���� = new �Ϲݳ���(); // ���� ����
		a�� = new �Ϲݹ�();
	}
}

class �������� extends ���� {
	��������() {
		a���� = new ��������(); // ���� ����
		a�� = new ������();
	}
}

class ����2���� extends �������� {
	����2����() {
		a���� = new ��������(); // ���� ����
		a�� = new ������();
	}
}

class �Ƽ������ extends ���� {
	�Ƽ������() {
		a���� = new �Ϲݳ���(); // ���� ����
		a�� = new ������();
	}
}