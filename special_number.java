import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        System.out.println("Special numbers are :");
        while(a<=b){
            int c = a % 10 ;
            int d = (a / 10) % 10 ;
            int e = c + d ;
            int f = c * d ;
            int g = e + f ;
            if ( a == g ){
                System.out.println(a);
            }
            a = a + 1 ;
        }
    }
}
