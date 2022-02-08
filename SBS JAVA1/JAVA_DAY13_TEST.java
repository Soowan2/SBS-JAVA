package example;

import java.util.Scanner;
import java.util.Random;
public class JAVA_DAY13_TEST {
	// =============================================================================================
	  // �ζ� ��÷��ȣ ���ʽ� ��ȣ ���� 7�� �ߺ����� �������� ������ �迭�� �����ϰ� ��ȯ���ִ� �Լ�
	  // =============================================================================================
		public static int[] getLottoNums() {

			int[] lottoNums = new int[7];
			Random random = new Random();

			int count = 0;
			while (true) {
				int no = random.nextInt(44) + 1; // 1 ~ 45
				if(isDuplicateNoInArr(lottoNums, no) == true) {
					continue;
				}
				
				lottoNums[count] = no;
				count++;
				
				// ���� ��ȣ�� �� ������ 7�� �Ǹ� ���� �ݺ� ����.
				if (count == 7) {
					break;
				}
			}

			return lottoNums;
		}

		// =============================================================================================
	  // �迭�� ���ڸ� �޾� �ش� �迭�� ���ڰ� �ߺ��Ǵ��� ���θ� �˻����ִ� �Լ�
	  // =============================================================================================
		public static boolean isDuplicateNoInArr(int[] targetNums, int no) {
			// ���� ������� ������ ��ȣ�߿� ���� ���� ��ȣ�� �����Ѱ� �ִ°�?
			// ������?? continue;
			for (int j = 0; j < targetNums.length; j++) {
				int myNo = targetNums[j];
				if (no == myNo) {
					no = -1;
					break;
				}
			}

			// �ߺ��� ��ȣ�� ������
			if (no == -1) {
				System.out.println("��ȣ�� �ߺ��˴ϴ�. �ٽ� �Է����ּ���.");
				return true;
			}
			
			return false;
		}

		// =============================================================================================
	  // ����ڿ��� ���ڸ� �Է¹޾� �ߺ����� 6�� �迭�� �������ְ� �� �迭�� ��ȯ�ϴ� �Լ�
	  // =============================================================================================
		public static int[] getMyNums() {
			
			Scanner sc = new Scanner(System.in);
			int[] myChooseNums = new int[6]; // ���� ������ ��ȣ
			int count2 = 0;
			
			while (true) {
				System.out.println((count2 + 1) + "��° ��ȣ�� �Է����ּ��� :");
				int no = Integer.parseInt(sc.nextLine()); // 1 ~ 45
				
				if(isDuplicateNoInArr(myChooseNums, no) == true) {
					continue;
				}

				// ���� ��ȣ ����.
				myChooseNums[count2] = no;
				count2++;

				// ���� ��ȣ�� �� ������ 6�� �Ǹ� ����.
				if (count2 == 6) {
					break;
				}
			}
			
			return myChooseNums;
		}
		

	  // ======================================================================================
	  // ���� ���μ���
	  // ======================================================================================
		public static void main(String[] args) {

			int[] lottoNums = getLottoNums(); // ��÷��ȣ 7�� �ּ���.
			int[] myChooseNums = getMyNums(); // ���� ������ ��ȣ 6�� �ּ���.
		
			// ======================================================================================
			// 2 ��� �ڵ�
			// ======================================================================================
			System.out.print("����� ������ ��ȣ�� : ");
			for (int i = 0; i < myChooseNums.length; i++) {
				System.out.print(myChooseNums[i] + " ");
			}
			System.out.println();
			// ======================================================================================
			// ��°��
			// ����� ������ ��ȣ�� : 3 12 19 23 36 41

			// 3. ���� ������ ��ȣ�� ��÷ ��ȣ�� �����Ͽ� ��÷Ȯ���ϴ� �ڵ带 �ۼ����ּ���. (���� ��ȣ ���� ����)
			// ======================================================================================
			int matchCount = 0;
			boolean isExistBonus = false;
			for (int i = 0; i < lottoNums.length; i++) {
				int no = lottoNums[i];

				for (int j = 0; j < myChooseNums.length; j++) {
					int myNo = myChooseNums[j];

					if (no == myNo) {
						matchCount++;
						break;
					} else if (myNo == lottoNums[lottoNums.length - 1]) {
						isExistBonus = true;
					}

				}

			}

			System.out.printf("���� ���� : %d\n", matchCount);

			// ======================================================================================

			// 1 ��� �ڵ�
			// ======================================================================================
			System.out.print("���õ� �ζ� ��ȣ : ");
			for (int i = 0; i < lottoNums.length - 1; i++) {
				System.out.print(lottoNums[i] + " ");
			}
			System.out.println(", ���ʽ� ��ȣ : " + lottoNums[lottoNums.length - 1]);
			// ======================================================================================
			// ��°��
			// ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36

			if (matchCount == 6) {
				System.out.println("1��");
			} else if (matchCount == 5) { // ���ʽ� ��ȣ ��ġ ���� O
				if (isExistBonus == true) {
					System.out.println("2��");
				} else {
					System.out.println("3��");
				}
			} else if (matchCount == 4) {
				System.out.println("4��");
			} else if (matchCount == 3) {
				System.out.println("5��");
			} else {
				System.out.println("��");
			}
		}
}
