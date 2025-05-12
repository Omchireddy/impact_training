import java.util.Scanner;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
        int b = a % 10 ;
        int c = a / 100 ;
        int d = (a/10) % 10 ;
        System.out.println(d+c+b);
    }
}
