import java.util.Scanner;

public class Arrr {
    public static void main(String[] args) {

        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        System.out.println("please enter the value of the first array-:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("please enter the value of the second array-:");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();

        }

        for (i = 0; i < n; i++) {
            c[i] = a[i] + b[i];

            System.out.println(" the sum of two number at index  " + i + " =" + c[i]);

        }
    }
}