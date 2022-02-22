package DAY11;


import java.util.ArrayList;
import java.util.Scanner;

public class DAY11_2 {

	public static void main(String[] args) {
		Board myBoard = new Board();
		myBoard.run();
	}
}

class Board {
	
	ArrayList<Integer> nums = new ArrayList<>();
	ArrayList<String> titles = new ArrayList<>();
	ArrayList<String> bodies = new ArrayList<>();
	ArrayList<Article> articles = new ArrayList<>();

	public void printArticles() {
		for(int i = 0; i < titles.size(); i++) {
			System.out.printf("��ȣ : %d\n", i + 1);
			System.out.printf("���� : %s\n", titles.get(i));
			System.out.println("========================");
		}
	}
	public void run() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("��ɾ �Է����ּ��� : ");
			String command = sc.nextLine();

			if (command.equals("help")) {
				System.out.println("add  : �Խù� ���");
				System.out.println("list : �Խù� ��� ��ȸ");

			} else if (command.equals("add")) {

				System.out.print("������ �Է����ּ��� : ");
				String title = sc.nextLine();
				System.out.print("������ �Է����ּ��� : ");
				String body = sc.nextLine();

				titles.add(title);
				bodies.add(body);
				System.out.println("�Խù��� ��ϵǾ����ϴ�.");

			} else if (command.equals("list")) {
				printArticles();

			} else if (command.equals("update")) {
				System.out.print("������ �Խù� ��ȣ :");
				int no = Integer.parseInt(sc.nextLine());

				if (no < 0 || no >= titles.size()) {
					System.out.println("���� �Խù��Դϴ�.");

				} else {
					System.out.print("������ : ");
					String newTitle = sc.nextLine();
					System.out.print("������ : ");
					String newBody = sc.nextLine();

					titles.set(no - 1, newTitle);
					bodies.set(no - 1, newBody);

					System.out.println("������ �Ϸ�Ǿ����ϴ�.");

					printArticles();

				}
			}
			
			else if(command.equals("delete")) {
				System.out.print("������ �Խù� ��ȣ :");
				int no = Integer.parseInt(sc.nextLine());

				if (no < 0 || no >= titles.size()) {
					System.out.println("���� �Խù��Դϴ�.");

				}
				
				titles.remove(no - 1);
				bodies.remove(no - 1);
				
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				printArticles();
			}
		}
	}
}

class Article{
	
	private int idx;
	private String title;
	private String body;
	
	// �⺻ ������
	public Article() {}
	
	// ��� �Ű����� �޴� ������ -> generate constructor using fields
	public Article(int idx, String title, String body) {
		super();
		this.idx = idx;
		this.title = title;
		this.body = body;
	}
	
	// generate getters and setters
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	
}