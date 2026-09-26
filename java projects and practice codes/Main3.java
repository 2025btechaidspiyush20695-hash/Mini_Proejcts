import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        for(int i=n ; i>=1; i-- ){
            for(int k=1; k<=n; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
