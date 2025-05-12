import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int original = a ;
        int b = a * a ;
        int reverse = 0 ;
        int n = 0 ;
        while (a != 0 ){
            int c = a % 10 ;
            reverse = reverse * 10 + c ;
            a = a / 10 ;
            n++;
        }
        int m = 1;
        for (int i = 0; i < n; i++) {
            m = m * 10;
        }
        int d = b % m ;
        int e = b / m ;
        int f = d + e ;
        if (f == original){
            System.out.println("Kaprekar number") ;
        }
        else {
            System.out.println("Not kaprekar number") ;
        }
    }
}
