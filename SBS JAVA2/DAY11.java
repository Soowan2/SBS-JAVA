package DAY11;

import java.util.ArrayList;
import java.util.Scanner;

public class DAY11 {
	public static void main(String[] args) {
		// ��ɾ �Է����ּ��� : (���) help(�Է�)
		// add : �Խù� ��� (���)
		// list : �Խù� ��� ��ȸ (���)
		// ��ɾ �Է����ּ��� : (���) add(�Է�)
		// ������ �Է����ּ��� : (���) �ȳ��ϼ���(�Է�)
		// ������ �Է����ּ��� : (���) �ݰ����ϴ�(�Է�)
		// �Խù��� ����Ǿ����ϴ�. (���)
		// ��ɾ �Է����ּ��� : (���) list(�Է�)
		// ��ȣ : 1(���)
		// ���� : �ȳ��ϼ���(���)
		// ���� : �ݰ����ϴ�(���)
		// ====================================(���)
		// ��ɾ �Է����ּ��� : (���) add(�Է�)
		// ������ �Է����ּ��� : (���) �ȳ��ϼ���2(�Է�)
		// ������ �Է����ּ��� : (���) �ݰ����ϴ�2(�Է�)
		// �Խù��� ����Ǿ����ϴ�. (���)
		// ��ɾ �Է����ּ��� : (���) list(�Է�)
		// ��ȣ : 1(���)
		// ���� : �ȳ��ϼ���(���)
		// ���� : �ݰ����ϴ�(���)
		// ====================================(���)
		// ��ȣ : 2(���)
		// ���� : �ȳ��ϼ���2(���)
		// ���� : �ݰ����ϴ�2(���)
		// ====================================(���)

	

		ArrayList<String> titles = new ArrayList();
		ArrayList<String> bodies = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
				
		while (true) {
			System.out.print("��ɾ �Է����ּ��� : ");
			String command = scanner.nextLine();	
			
			if (command.equals("help")) {
				System.out.println("add : �Խù� ���");
				System.out.println("list : �Խù� ��� ��ȸ");
				System.out.println("====================================");
			}
			
			else if (command.equals("add")) {
				System.out.print("������ �Է����ּ��� : ");
				String title = scanner.nextLine();
				System.out.print("������ �Է����ּ��� : ");
				String body = scanner.nextLine();
				
				titles.add(title);
				bodies.add(body);
				System.out.println("�Խù��� ��ϵǾ����ϴ�.");
				System.out.println("====================================");
			}
			
			if (command.equals("list")) {
				for(int i = 0; i < titles.size(); i++)
				{
					System.out.printf("��ȣ : %d\n",i+1);
					System.out.printf("���� : %s\n", titles.get(i));
					System.out.printf("���� : %s\n", bodies.get(i));
					System.out.println("====================================");
				}
				
			
			}
		}

	}
}
