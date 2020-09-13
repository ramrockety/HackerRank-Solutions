import java.util.Scanner;

/**
 * @author rama brahmam botla
 *
 */
public class Day3IntroToConditionalStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if ((n & 1) == 1) {
			ans = "Weird";
		} else {
			if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");

			}
		}
		System.out.println(ans);
	}
}
