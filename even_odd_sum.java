import java.util.Scanner;

class even_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;

        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();  

        for (int i = 0; i < n; i++) {
            System.out.println("Enter an integer: ");
            int a = sc.nextInt();

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