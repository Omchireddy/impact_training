import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        int f = a / 100 ;
        int m = (a/10) % 10 ;
        int l = a % 10 ;
        System.out.println(l*100 + m*10 + f) ;
    }
}