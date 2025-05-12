import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int per_day = sc.nextInt();
        int total_days = sc.nextInt();
        double total_rent;
        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }
        if ((month >= 4 && month <= 6) || month == 11 || month == 12)
        {
            total_rent = per_day * 1.2 * total_days;
        } 
        else 
        {
            total_rent = per_day * total_days;
        }
        System.out.printf("%.2f\n", total_rent);
    }
}
