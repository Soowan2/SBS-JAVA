package DAY13;

import java.util.ArrayList;
import java.util.Scanner;

class Board {

	ArrayList<Article> articles = new ArrayList<>();
	int lastestArticleNo = 4;
	Scanner sc = new Scanner(System.in);

	public void run() {
		init();

		while (true) {
			System.out.print("��ɾ �Է����ּ��� : ");
			String command = sc.nextLine();

			if (command.equals("help")) {
				printHelp();

			} else if (command.equals("add")) {
				add();

			} else if (command.equals("list")) {
				printArticles(articles);

			} else if (command.equals("update")) {
				update();

			} else if (command.equals("delete")) {
				delete();

			} else if (command.equals("search")) {
				search();

			} else if (command.equals("read")) {
				read();
			}
		}
	}

	private void printArticle(Article article) {
		System.out.printf("===== %d�� �Խù� =====\n", article.getIdx());
		System.out.printf("��ȣ : %d\n", article.getIdx());
		System.out.printf("���� : %s\n", article.getTitle());
		System.out.printf("-----------------\n");
		System.out.printf("���� : %s\n", article.getBody());
		System.out.printf("-----------------\n");
		System.out.println("====================");
	}

	private void read() {
		System.out.print("�󼼺����� �Խù� ��ȣ�� �Է����ּ��� :");
		int idx = Integer.parseInt(sc.nextLine());

		Article article = getArticleByIdx(idx);

		if (article != null) {
			printArticle(article);
		} else {
			System.out.println("���� �Խù��Դϴ�.");
		}

	}

	private void search() {

		System.out.print("�˻� Ű���带 �Է����ּ��� : ");
		String keyword = sc.nextLine();

		ArrayList<Article> searchedList = new ArrayList<>();

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);

			if (article.getTitle().contains(keyword)) {
				searchedList.add(article);
			}
		}

		printArticles(searchedList);

	}

	private void init() {

		Article a1 = new Article(1, "����1", "����1");
		Article a2 = new Article(2, "����2", "����2");
		Article a3 = new Article(3, "����2", "����2");

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);

	}

	private void printHelp() {
		System.out.println("add  : �Խù� ���");
		System.out.println("list : �Խù� ��� ��ȸ");
		System.out.println("update : �Խù� ����");
		System.out.println("delete : �Խù� ����");
	}

	private void delete() {
		System.out.print("������ �Խù� ��ȣ :");
		int idx = Integer.parseInt(sc.nextLine());
		Article article = getArticleByIdx(idx);

		if (article != null) {
			// articles.remove(i);// ������������� ����
			articles.remove(article);// ����������� ����
			printArticles(articles);
		} else {
			System.out.println("���� �Խù��Դϴ�.");
		}
	}

	private void update() {
		System.out.print("������ �Խù� ��ȣ :");
		int idx = Integer.parseInt(sc.nextLine());
		Article article = getArticleByIdx(idx);

		if (article != null) {
			System.out.print("������ : ");
			String newTitle = sc.nextLine();
			System.out.print("������ : ");
			String newBody = sc.nextLine();

			article.setTitle(newTitle);
			article.setBody(newBody);
			printArticles(articles);
		} else {
			System.out.println("���� �Խù��Դϴ�.");
		}
	}

	private void add() {
		System.out.print("������ �Է����ּ��� : ");
		String title = sc.nextLine();
		System.out.print("������ �Է����ּ��� : ");
		String body = sc.nextLine();

		Article article = new Article(lastestArticleNo, title, body);
		articles.add(article);

		System.out.println("�Խù��� ��ϵǾ����ϴ�.");
		lastestArticleNo++;
	}

	public Article getArticleByIdx(int idx) {
		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			if (article.getIdx() == idx) {
				return article;
			}
		}

		return null;
	}

	public void printArticles(ArrayList<Article> targetList) {
		for (int i = 0; i < targetList.size(); i++) {

			Article article = targetList.get(i);

			System.out.printf("��ȣ : %d\n", article.getIdx());
			System.out.printf("���� : %s\n", article.getTitle());
			System.out.println("========================");
		}
	}
}