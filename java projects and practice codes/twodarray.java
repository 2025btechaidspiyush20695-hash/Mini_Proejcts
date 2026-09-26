import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {5, 6, 7}, {1, 5, 8}};
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Sum = Sum + arr[i][j];
            }
        }
        System.out.println(Sum);
        System.out.println();
        int[][] arr2 = {{2, 3, 4}, {5, 6, 7}, {1, 5, 8}};
        for (int i = 0; i < arr2.length; i++) {
            int Sum1 = 0;
            for (int j = 0; j < arr2.length; j++) {
                Sum1 = Sum1 + arr2[j][i];
            }
            System.out.println(Sum1);
        }
        System.out.println();
        int[][] arr1 = {{2,3,4},{5,6,7},{1,5,8}};
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
