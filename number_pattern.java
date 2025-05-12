import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        int c = 0 ;
        for (int i = 1 ; i <=a ; i++){
            for(int j = 1 ; j <= b ; j++){
                c = c + 1 ;
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}
