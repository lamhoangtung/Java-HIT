import java.util.Scanner;

public class bai2 {

    static int n;

    private static void delete(int[] a) {
        System.out.print("\nNhap vi tri can xoa: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
    }

    private static void output(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void insert(int[] a) {
        System.out.print("\nNhap vi tri can them: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.print("Nhap so them: ");
        int so = sc.nextInt();
        for (int i = n; i >= index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = so;
        n++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua mang: ");
            a[i] = sc.nextInt();
        }
        delete(a);
        System.out.println("Mang sau khi xoa la: ");
        output(a);
        insert(a);
        System.out.println("Mang sau khi them la: ");
        output(a);
    }
}
