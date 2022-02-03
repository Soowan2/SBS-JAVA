import java.util.Scanner;

public class JAVA_DAY14 {

//	public static void introduce(String home, int age, String name) {
//
//		System.out.printf("%s¿¡ »ç´Â %d»ì %sÀÔ´Ï´Ù.\n", home, age, name);
//	}
//	
//	public static void addAge(int age, String name) {
//		int addedAge = age + 1;
//		System.out.printf("%sÀÇ ³ªÀÌ°¡ %d¿¡¼­ %d·Î ÇÑ»ì ¸Ô¾ú½À´Ï´Ù.", name, age, addedAge);
//	}

	public static void main(String args[]) {

		// »ç¶÷ : ³ªÀÌ, ÀÌ¸§, °íÇâ
		// ÇÑ »ç¶÷À» Ç¥ÇöÇÏ±â À§ÇØ ¼¼°³ÀÇ µ¥ÀÌÅÍ
		// ±â´É : ÀÚ±â¼Ò°³, ³ªÀÌ¸Ô±â

//		int age = 20;
//		String name = "È«±æµ¿";
//		String home = "´ëÀü";

//      ±¸Á¶È­ -> ÇÁ·Î±×·¡¹Ö = ±¸Á¶È­ÇÏ´Â ÀÛ¾÷
		// ÇÏ³ªÀÇ ±¸Á¶¸¦ ¸¸µé¾úÀ¸¸é ±× ±¸Á¶ÀÇ º¹»çº»À» ¸¸µé¾î¼­ »ç¿ëÇÏÀÚ.
//		Person.introduce();
//		Person.addAge();
		
		// Person º¹»çº» ¸¸µé±â
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.introduce();
		p1.addAge();

		p2.introduce();
		p2.addAge();
		
//		introduce(home, age, name);
//		introduce(home2, age2, name2);
//		
//		addAge(age2,name2);
		
		// µ¥ÀÌÅÍ°¡ ´Ù¸£°í ÀıÂ÷³ª ±¸Á¶°¡ °°À¸¸é ÀÌ°Ç °°Àº°Å´Ù. => ÀçÈ°¿ë
		// °ªÀ» ÀçÈ°¿ë -> º¯¼ö
		// ÀıÂ÷¸¦ ÀçÈ°¿ë -> ÇÔ¼ö
		// º¯¼ö¶û ÇÔ¼ş¯M ±¸Á¶¸¦ ÀçÈ°¿ë -> Å¬·¡½º¿Í °´Ã¼

	}

}

// »ç¶÷ Å¬·¡½º -> µ¥ÀÌÅÍ±¸Á¶ + ÇÔ¼ö
class Person{

	static int age = 20;
	static String name = "È«±æµ¿";
	static String home = "´ëÀü";

	public static void introduce() {

		System.out.printf("%s¿¡ »ç´Â %d»ì %sÀÔ´Ï´Ù.\n", home, age, name);
	}

	public static void addAge() {
		int addedAge = age + 1;
		System.out.printf("%sÀÇ ³ªÀÌ°¡ %d¿¡¼­ %d·Î ÇÑ»ì ¸Ô¾ú½À´Ï´Ù.\n", name, age, addedAge);
	}
}