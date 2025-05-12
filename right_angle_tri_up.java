import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        for (int i = a ; i >= 1 ; i--){
            for (int s = 1; s <= a - i; s++) {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ") ;
            }
            System.out.println(" ");
        }
    }
}
