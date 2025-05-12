import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        if (a == 0){
            System.out.println("Zero") ;
        }
        else if(a > 9){
            System.out.println("Invalid single number") ;
        }
        else if(a%2 == 0){
            System.out.println("Even") ;
        }
        else if(a%2 == 1){
            System.out.println("Odd") ;
        }
    }
}
