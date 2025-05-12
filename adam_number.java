import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = a * a ;
        int reverse = 0 ;
        while ( a != 0 ) {
            int c = a % 10 ;
            reverse = reverse * 10 + c ;
            a = a / 10 ;
        }
        int d = reverse * reverse ; 
        int square_reverse = 0 ;
        while ( d != 0) {
            int e = d % 10 ;
            square_reverse = square_reverse * 10 + e ;
            d = d /10 ;
        }
        if (b == square_reverse){
            System.out.println("Adam number");
        }
        else{
            System.out.println("It is not Adam number") ;
        }
    }
}
