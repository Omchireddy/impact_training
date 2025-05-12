import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        int middle = (a/10) % 10 ;
        if(a < 1000){
            if (middle%3 == 0){
                System.out.println("It is a Trendy number") ;
            }
            else{
                System.out.println("Not a trendy number") ;
            }
        }
        else{
            System.out.println("Invalid number") ;
        }
    }
}
