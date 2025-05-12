import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int months = sc.nextInt() ;
        int month = 1 ;
        int first = 0 ;
        int second = 1 ;
        int fab = first + second ; 
        while (month < months){
            first = second ; 
            second = fab ;
            fab = first + second ;
            month++ ;
        }
        System.out.println(first);
    }
}
