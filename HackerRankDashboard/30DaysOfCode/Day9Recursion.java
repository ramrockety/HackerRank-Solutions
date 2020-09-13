```java
import java.util.Scanner;

/**
 * @author rama brahmam botla
 *
 */
public class Day9Recursion {
	public static int factorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
}
```
