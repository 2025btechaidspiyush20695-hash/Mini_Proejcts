import java.util.Scanner;
class array2 {
    public static void main(String[] Face) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(arr[1][0]);
    }
}