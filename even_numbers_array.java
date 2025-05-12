import java.util.Scanner ;
class jain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int arr[] = new int[a+1] ;
        for (int i = 0 ; i <= a ; i++){
            if(i%2 == 0){
                arr[i] = i ;
                System.out.println(arr[i]);
            }
        }
    }
}
