package DAY12;

import java.util.ArrayList;
import java.util.Scanner;



public class My_Board {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.run();
	}
}




class Board{

	ArrayList<String> titles = new ArrayList<>();
	ArrayList<String> bodies = new ArrayList<>();
	ArrayList<Integer> numbers = new ArrayList<>();
	int number = 0;

	public void show_list(){
		for(int i = 0; i < titles.size(); i++)
		{
			System.out.printf("��ȣ : %d\n", numbers.get(i));
		    System.out.printf("���� : %s\n", titles.get(i));
		    System.out.printf("���� : %s\n", bodies.get(i));
		    System.out.println("====================================");
		}
	}
/*
 * System.out.printf("��ȣ : %d\n", numbers.get(i))
 * */
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("��ɾ �Է����ּ��� : ");
			String command = scan.nextLine();

			if (command.equals("help")) {
				System.out.println("add : �Խù� ���");
				System.out.println("list : �Խù� ��� ��ȸ");
			}

			if (command.equals("add")) {
				System.out.print("������ �Է����ּ��� : ");
				String title = scan.nextLine();
				System.out.print("������ �Է����ּ��� : ");
				String body = scan.nextLine();
				number += 1;
				

				titles.add(title);
				bodies.add(body);
				numbers.add(number);
				
				System.out.println("�Խù��� ����Ǿ����ϴ�.");
			}

			if (command.equals("list")) {
				show_list();
			}

			if (command.equals("update")) {
				System.out.print("������ �Խù� ��ȣ : ");
				int no = Integer.parseInt(scan.nextLine());

				if (no > titles.size()) {
					System.out.println("���� �Խù� ��ȣ�Դϴ�.");
				}

				else {
					System.out.print("�� ���� : ");
					String title = scan.nextLine();
					System.out.print("�� ���� : ");
					String body = scan.nextLine();

					titles.set(no - 1, title);
					bodies.set(no - 1, body);

				}

				System.out.println("������ �Ϸ�Ǿ����ϴ�.");

				show_list();
			}
			
			if(command.equals("delete")) {
				System.out.print("������ �Խù� ��ȣ : ");
				
				int no = Integer.parseInt(scan.nextLine());
				
				if(no > titles.size()) {
					System.out.println("���� �Խù� ��ȣ�Դϴ�.");
				}
				
				else {
					titles.remove(no - 1);
					bodies.remove(no - 1);
					numbers.remove(no - 1);
					
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					show_list();
				}
			}
		}
	}
}

/* �䱸���� : �Խù� ����

1. �Խù� ���� ��� ����. ��ɾ� : delete

2. ���ϴ� �Խù��� ������ ������ �� �־�� �մϴ�.

3. �ùٸ��� ���� �Խù��� �����ϸ� �Խù��� ���ٰ� ���;� �մϴ�.

4. ������ �Ϸ�Ǹ� �ٽ� ����� �����ּ���.



��ɾ �Է����ּ��� : delete
������ �Խù� ��ȣ : 3
���� �Խù� ��ȣ�Դϴ�.
��ɾ �Է����ּ��� : delete
������ �Խù� ��ȣ : 1
������ �Ϸ�Ǿ����ϴ�.
===================
��ȣ : 2
���� : ����2
===================
��ɾ �Է����ּ��� :

*/

