import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        for(int i=1 ; i<=n; i++ ){
            for(int k=1; k<=n; k++){
                if(k==1 || k==n || i==1 || i==n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
