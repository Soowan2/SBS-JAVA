package DAY10;

import java.util.Scanner;

public class DAY_TEST3 {

	public static void main(String[] args) {
		// 명령어를 입력해주세요 : (출력) help(입력)
		// add : 게시물 등록 (출력)
		// list : 게시물 목록 조회 (출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요2(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다2(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 번호 : 2(출력)
		// 제목 : 안녕하세요2(출력)
		// 내용 : 반갑습니다2(출력)
		// ====================================(출력)

	

		Scanner scanner = new Scanner(System.in);
				
		while (true) {
			System.out.println("명령어를 입력해주세요 : ");
			String command = scanner.nextLine();	
			
			if (command.equals("help")) {
				System.out.println("add : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
				System.out.println("====================================");
			}
			
			if (command.equals("add")) {
				System.out.println("add 기능 구현");
				System.out.println("====================================");
			}
			
			if (command.equals("list")) {
				System.out.println("list 기능 구현");
				System.out.println("====================================");
			}
		}

	}
}
