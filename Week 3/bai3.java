import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua mang: ");
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Mang sau khi sap xep theo yeu cau la: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (a[i] % 2 != 0 && a[j] % 2 == 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (a[i] % 2 != 0 && a[j] % 2 != 0 && a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.printf("\n");
    }
}