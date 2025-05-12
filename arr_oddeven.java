import java.util.Scanner;

class arr_oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt(); 

        int[] numbers = new int[n];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int a = numbers[i];

            if (a == 0) {
                System.out.println("Zero");
            } else if (a > 9) {
                System.out.println("Invalid single number");
            } else if (a % 2 == 0) {
                System.out.println("Even");
                evenSum += a;
            } else {
                System.out.println("Odd");
                oddSum += a;
            }
        }

        System.out.println("Sum of Even numbers: " + evenSum);
        System.out.println("Sum of Odd numbers: " + oddSum);

        sc.close();
    }
}