
import java.util.Scanner;

public class bai5 {

    private static void output(int[][] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhap chieu dai cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Nhap chieu rong cua mang: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap phan tu tai vi tri (" + (i + 1) + ", " + (j + 1) + ") cua mang: ");
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Mang hai chieu vua nhap la:");
        output(a, n, m);
        int b[][] = new int[m][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                b[j][n - 1 - i] = a[i][j];
            }
        }
        int temp = n;
        n = m;
        m = temp;
        System.out.println("Mang sau khi xoay la: ");
        output(b, n, m);
    }

}