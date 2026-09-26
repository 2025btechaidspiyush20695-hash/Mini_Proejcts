import java.util.Scanner;

public class Functions {

    public static void functions(){
        int c = add(3,7);
        System.out.println(c);
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static char name(String name_person) {
        for(int i = 0; i < name_person.length(); i++) {
            if(name_person.charAt(i) == 'a') {
                return name_person.charAt(i);
            }
        }
        return ' ';
    }

    public static int arr_maximum_number(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int arr_second_maximum_number(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;

    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,6,4,8,5,9,4,2};
        int m = arr_maximum_number(arr);
        int n = arr_second_maximum_number(arr);
        System.out.println("The maximum number is : "+m);
        System.out.println("The second maximum number is: " + n);

    }
}

// leet code must do : 344 , 125 , 242 , 387 , 389 , 28 , 709 , 771 , 1678 , 1768


