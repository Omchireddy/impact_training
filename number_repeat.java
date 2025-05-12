import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int m = sc.nextInt() ;
        int r;
        int sum = 0 ;
        while(number != 0){
            r = number % 10 ;
            if(m == r){
                sum++ ;
            }
            number = number / 10 ;
        }
        System.out.println(sum) ;
    }
}
