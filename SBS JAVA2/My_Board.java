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
			System.out.printf("번호 : %d\n", numbers.get(i));
		    System.out.printf("제목 : %s\n", titles.get(i));
		    System.out.printf("내용 : %s\n", bodies.get(i));
		    System.out.println("====================================");
		}
	}
/*
 * System.out.printf("번호 : %d\n", numbers.get(i))
 * */
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("명령어를 입력해주세요 : ");
			String command = scan.nextLine();

			if (command.equals("help")) {
				System.out.println("add : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
			}

			if (command.equals("add")) {
				System.out.print("제목을 입력해주세요 : ");
				String title = scan.nextLine();
				System.out.print("내용을 입력해주세요 : ");
				String body = scan.nextLine();
				number += 1;
				

				titles.add(title);
				bodies.add(body);
				numbers.add(number);
				
				System.out.println("게시물이 저장되었습니다.");
			}

			if (command.equals("list")) {
				show_list();
			}

			if (command.equals("update")) {
				System.out.print("수정할 게시물 번호 : ");
				int no = Integer.parseInt(scan.nextLine());

				if (no > titles.size()) {
					System.out.println("없는 게시물 번호입니다.");
				}

				else {
					System.out.print("새 제목 : ");
					String title = scan.nextLine();
					System.out.print("새 내용 : ");
					String body = scan.nextLine();

					titles.set(no - 1, title);
					bodies.set(no - 1, body);

				}

				System.out.println("수정이 완료되었습니다.");

				show_list();
			}
			
			if(command.equals("delete")) {
				System.out.print("삭제할 게시물 번호 : ");
				
				int no = Integer.parseInt(scan.nextLine());
				
				if(no > titles.size()) {
					System.out.println("없는 게시물 번호입니다.");
				}
				
				else {
					titles.remove(no - 1);
					bodies.remove(no - 1);
					numbers.remove(no - 1);
					
					System.out.println("삭제가 완료되었습니다.");
					show_list();
				}
			}
		}
	}
}

/* 요구사항 : 게시물 삭제

1. 게시물 삭제 기능 구현. 명령어 : delete

2. 원하는 게시물을 선택해 삭제할 수 있어야 합니다.

3. 올바르지 않은 게시물을 선택하면 게시물이 없다고 나와야 합니다.

4. 삭제가 완료되면 다시 목록을 보여주세요.



명령어를 입력해주세요 : delete
삭제할 게시물 번호 : 3
없는 게시물 번호입니다.
명령어를 입력해주세요 : delete
삭제할 게시물 번호 : 1
삭제가 완료되었습니다.
===================
번호 : 2
제목 : 제목2
===================
명령어를 입력해주세요 :

*/

