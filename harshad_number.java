import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int r;
        int sum = 0 ;
        while(number != 0){
            r = number % 10 ;
            sum = sum + r ;
            number = number / 10 ;
        }
        if(number % sum == 0){
            System.out.println("It is a harshad number") ;
        }
        else{
            System.out.println("It is not a harshad number") ;
        }
    }
}
