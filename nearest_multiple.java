import java.util.Scanner;

class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int q = num / m;
        int lower = q * m;
        int upper = (q + 1) * m;
        int first = num - lower;
        int second = upper - num;

        if (first < second) {
            System.out.println(lower);
        } else if (first > second) {
            System.out.println(upper);
        } else {
            System.out.println(upper); // Tie — return greater
        }
    }
}
