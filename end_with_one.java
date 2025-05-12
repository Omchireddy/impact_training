import java.util.Scanner;

public class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
                System.out.print(a + "->");
            } else {
                a = 3 * a + 1;
                System.out.print(a + "->");
            }
        }
    }
}
