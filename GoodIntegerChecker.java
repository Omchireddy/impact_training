import java.util.Scanner;

public class GoodIntegerChecker {

    // Highly optimized function to find two integers whose cubes result in the given number
    public static String findGoodInteger(int num, int[] count) {
        int limit = (int) Math.cbrt(num);  // Cube root limit
        for (int i = 1; i <= limit; i++) {
            count[0]++;  // Increment count for every integer checked
            int cube1 = i * i * i;
            if (num % cube1 == 0) {  // Check if num is divisible by i^3
                int quotient = num / cube1;
                int j = (int) Math.cbrt(quotient);  // Check if quotient is a perfect cube
                count[0]++;  // Increment count for the inner check
                if (j * j * j == quotient) {
                    return "Good integer: " + i + "^3 * " + j + "^3";
                }
            }
        }
        return "Not a good integer";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int[] count = {0};

        String result = findGoodInteger(num, count);
        System.out.println(result);
        System.out.println("Integers checked: " + count[0]);

        scanner.close();
    }
}