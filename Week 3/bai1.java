import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + " cua mang: ");
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.printf("\n");
    }
}