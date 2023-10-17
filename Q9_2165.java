//Name - Anish Kumar Thella
//Registration number - 2241020012
//problem line - https://cses.fi/problemset/task/2165/

import java.util.Scanner;
public class Q9_2165 {

    static void towerOfHanoi(int n, int A, int C, int B) {
        if (n == 1) {
            System.out.println(A + " " + C);
            return;
        }
        towerOfHanoi(n - 1, A, B, C);
        System.out.println(A + " " + C);
        towerOfHanoi(n - 1, B, C, A);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int) (Math.pow(2, n) - 1));
        towerOfHanoi(n, 1, 3, 2);
        scanner.close();
    }
}
