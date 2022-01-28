package example;

import java.util.Scanner;
import java.util.Random;
public class JAVA_DAY13_TEST {
	// =============================================================================================
	  // 로또 당첨번호 보너스 번호 포함 7개 중복없이 랜덤으로 생성해 배열에 저장하고 반환해주는 함수
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
				
				// 뽑은 번호의 총 갯수가 7이 되면 무한 반복 종료.
				if (count == 7) {
					break;
				}
			}

			return lottoNums;
		}

		// =============================================================================================
	  // 배열과 숫자를 받아 해당 배열에 숫자가 중복되는지 여부를 검사해주는 함수
	  // =============================================================================================
		public static boolean isDuplicateNoInArr(int[] targetNums, int no) {
			// 내가 현재까지 저장한 번호중에 지금 뽑힌 번호랑 동일한게 있는가?
			// 있으면?? continue;
			for (int j = 0; j < targetNums.length; j++) {
				int myNo = targetNums[j];
				if (no == myNo) {
					no = -1;
					break;
				}
			}

			// 중복된 번호가 있으면
			if (no == -1) {
				System.out.println("번호가 중복됩니다. 다시 입력해주세요.");
				return true;
			}
			
			return false;
		}

		// =============================================================================================
	  // 사용자에게 숫자를 입력받아 중복없이 6개 배열에 저장해주고 그 배열을 반환하는 함수
	  // =============================================================================================
		public static int[] getMyNums() {
			
			Scanner sc = new Scanner(System.in);
			int[] myChooseNums = new int[6]; // 내가 선택한 번호
			int count2 = 0;
			
			while (true) {
				System.out.println((count2 + 1) + "번째 번호를 입력해주세요 :");
				int no = Integer.parseInt(sc.nextLine()); // 1 ~ 45
				
				if(isDuplicateNoInArr(myChooseNums, no) == true) {
					continue;
				}

				// 뽑은 번호 저장.
				myChooseNums[count2] = no;
				count2++;

				// 뽑은 번호의 총 갯수가 6이 되면 종료.
				if (count2 == 6) {
					break;
				}
			}
			
			return myChooseNums;
		}
		

	  // ======================================================================================
	  // 메인 프로세스
	  // ======================================================================================
		public static void main(String[] args) {

			int[] lottoNums = getLottoNums(); // 당첨번호 7개 주세요.
			int[] myChooseNums = getMyNums(); // 내가 선택한 번호 6개 주세요.
		
			// ======================================================================================
			// 2 출력 코드
			// ======================================================================================
			System.out.print("당신이 선택한 번호는 : ");
			for (int i = 0; i < myChooseNums.length; i++) {
				System.out.print(myChooseNums[i] + " ");
			}
			System.out.println();
			// ======================================================================================
			// 출력결과
			// 당신이 선택한 번호는 : 3 12 19 23 36 41

			// 3. 내가 선택한 번호와 당첨 번호를 대조하여 당첨확인하는 코드를 작성해주세요. (맞은 번호 개수 세기)
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

			System.out.printf("맞은 개수 : %d\n", matchCount);

			// ======================================================================================

			// 1 출력 코드
			// ======================================================================================
			System.out.print("선택된 로또 번호 : ");
			for (int i = 0; i < lottoNums.length - 1; i++) {
				System.out.print(lottoNums[i] + " ");
			}
			System.out.println(", 보너스 번호 : " + lottoNums[lottoNums.length - 1]);
			// ======================================================================================
			// 출력결과
			// 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36

			if (matchCount == 6) {
				System.out.println("1등");
			} else if (matchCount == 5) { // 보너스 번호 일치 여부 O
				if (isExistBonus == true) {
					System.out.println("2등");
				} else {
					System.out.println("3등");
				}
			} else if (matchCount == 4) {
				System.out.println("4등");
			} else if (matchCount == 3) {
				System.out.println("5등");
			} else {
				System.out.println("꽝");
			}
		}
}
