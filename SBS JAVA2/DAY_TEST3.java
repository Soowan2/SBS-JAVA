package DAY10;

import java.util.Scanner;

public class DAY_TEST3 {

	public static void main(String[] args) {
		// ���ɾ �Է����ּ��� : (���) help(�Է�)
		// add : �Խù� ��� (���)
		// list : �Խù� ��� ��ȸ (���)
		// ���ɾ �Է����ּ��� : (���) add(�Է�)
		// ������ �Է����ּ��� : (���) �ȳ��ϼ���(�Է�)
		// ������ �Է����ּ��� : (���) �ݰ����ϴ�(�Է�)
		// �Խù��� ����Ǿ����ϴ�. (���)
		// ���ɾ �Է����ּ��� : (���) list(�Է�)
		// ��ȣ : 1(���)
		// ���� : �ȳ��ϼ���(���)
		// ���� : �ݰ����ϴ�(���)
		// ====================================(���)
		// ���ɾ �Է����ּ��� : (���) add(�Է�)
		// ������ �Է����ּ��� : (���) �ȳ��ϼ���2(�Է�)
		// ������ �Է����ּ��� : (���) �ݰ����ϴ�2(�Է�)
		// �Խù��� ����Ǿ����ϴ�. (���)
		// ���ɾ �Է����ּ��� : (���) list(�Է�)
		// ��ȣ : 1(���)
		// ���� : �ȳ��ϼ���(���)
		// ���� : �ݰ����ϴ�(���)
		// ====================================(���)
		// ��ȣ : 2(���)
		// ���� : �ȳ��ϼ���2(���)
		// ���� : �ݰ����ϴ�2(���)
		// ====================================(���)

	

		Scanner scanner = new Scanner(System.in);
				
		while (true) {
			System.out.println("���ɾ �Է����ּ��� : ");
			String command = scanner.nextLine();	
			
			if (command.equals("help")) {
				System.out.println("add : �Խù� ���");
				System.out.println("list : �Խù� ��� ��ȸ");
				System.out.println("====================================");
			}
			
			if (command.equals("add")) {
				System.out.println("add ��� ����");
				System.out.println("====================================");
			}
			
			if (command.equals("list")) {
				System.out.println("list ��� ����");
				System.out.println("====================================");
			}
		}

	}
}