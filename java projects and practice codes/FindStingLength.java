import java.util.Scanner;
public class FindStingLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr= {"piyush","lokesh","ravi"};
        System.out.println(arr[0].charAt(0));
        System.out.println(arr[1].charAt(0));

        char[] arr1 = {'a','e','i','o','u'};
        System.out.println(arr1[0]);

        String s1 ="abcdefghijklmno";
        for  (int i = 0; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            System.out.print(ch+" ");

        }

        String s ="abcdefghijklmno";
        for  (int i = s.length()-1 ; i >= 0 ; i--){
            char ch1 = s.charAt(i);
            System.out.print(ch1+" ");

        }


//Palidrome ka code


        String is_Palidrome = "MADAM";
        int left = 0 ;
        int right = is_Palidrome.length()-1;
        boolean isPalidrome = true;
        while(left<right){
            if(is_Palidrome.charAt(left) != is_Palidrome.charAt(right)){
                isPalidrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalidrome){
            System.out.println("Palidrome");
        }else {
            System.out.println("Not Palidrome");
        }

    }
}

//leetcode 344 , 125