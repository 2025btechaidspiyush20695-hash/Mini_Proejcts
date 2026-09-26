import java.util.Scanner;

public class MabLibGame {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        String Adjective1;
        String noun1;
        String Adjective2;
        String noun2;
        String Adjective3;

        System.out.print("Enter the value of Adjective 1 using -ing : ");
        Adjective1 = scanner.nextLine();
        System.out.print("Enter the value of noun 1 using -es: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter the value of Adjective 2 using a name : ");
        Adjective2 = scanner.nextLine();
        System.out.print("Enter the value of noun 2 using -ing : ");
        noun2 = scanner.nextLine();
        System.out.print("Enter the value of Adjective 3 with a name of animal : ");
        Adjective3 = scanner.nextLine();

        System.out.println("I lost in jungle and i was "+Adjective1+" ");
        System.out.println(noun1+" is good for health ");
        System.out.println(Adjective2+" is a mad person ");
        System.out.println(noun2+" is so good to see ");
        System.out.print(" I went to zoo and i see "+Adjective3);

        scanner.close();

    }
}