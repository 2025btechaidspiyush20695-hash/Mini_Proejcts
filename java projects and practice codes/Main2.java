import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        for(int i=0 ; i<n; i++ ){
            for(int k= 0; k<(n-i-1); k++){
                System.out.print("  ");
            }
            for(int j= 0; j<(2*i+1); j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}