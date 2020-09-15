import java.util.Scanner;

/**
 * @author rama brahmam botla
 *
 */
public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int rem = 0, counter = 0, maxOne = 0;
		String s = "";
		while (n > 0) {

			rem = n % 2;
			if (rem == 1) {
				counter++;
				if (counter > maxOne) {
					maxOne = counter;
				}
			} else {
				counter = 0;
			}
			s = rem + s;
			n = n / 2;

		}
		System.out.println(maxOne);
		System.out.println(s);

	}
}