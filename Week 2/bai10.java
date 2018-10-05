import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        int n, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (i == n - 1)
                    System.out.print("*");
                else if (j == n - k - 1 || j == n - 1 + k)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            k++;
            System.out.print("\n");
        }
    }
}