import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start ; i <= end ; i++){
            if(i % 7 == 0 && i % 9 == 0){
                System.out.println(i) ;
            }
        }
    }
}
