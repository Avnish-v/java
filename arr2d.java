import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
        int n, i, j;
        System.out.println("please enter the number of array element you want in two dimensional array-:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a[][] = new int[n][n];
        System.out.println("please enter the the first matrix values-:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        int c[][] = new int[n][n];
        int b[][] = new int[n][n];
        System.out.println("please enter the the first matrix values-:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();

            }

        }
        System.out.println("the addition of two dimensional array-: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("enter the sum" + i + " " + j + "index" + " " + c[i][j]);
            }

        }

    }
}
