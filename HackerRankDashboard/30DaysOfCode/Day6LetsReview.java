import java.util.Scanner;

/**
 * @author rama brahmam botla
 *
 */
public class Day6LetsReview {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfTest = sc.nextInt();//Integer.parseInt(sc.nextLine());
		String str1 = "", str2 = "";
		for (int i = 0; i < noOfTest; i++) {
			String input = sc.nextLine();
			char[] char1 = input.toCharArray();
			for (int j = 0; j < char1.length; j++) {
				if ((j & 1) == 0) {
					str1 = str1 + char1[j];
				} else {
					str2 = str2 + char1[j];

				}
			}
			System.out.println(str1 + " " + str2);
			str1 = str2 = "";
		}
		sc.close();
	}
}