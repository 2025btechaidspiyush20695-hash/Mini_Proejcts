
import java.util.Scanner;

public class IntroToScannerClass {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter name");
        String name = scanner.nextLine();

        System.out.print("enter age");
        int age = scanner.nextInt();

        System.out.print("enter spa: ");
        double spa = scanner.nextDouble();

        System.out.print("Enter bool");
        boolean bool = scanner.nextBoolean();

        System.out.print("hello "+name+"\n");
        System.out.print("you are "+age+" years old\n");
        System.out.print("you are "+spa+"\n");
        if(bool){
            System.out.print("you are enrolled");
        }else{
            System.out.print("you are not enrolled");
        }

        scanner.close();
    }
}
