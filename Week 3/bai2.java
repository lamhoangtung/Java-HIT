import java.util.Scanner;

public class bai2 {

    static int n;

    private static void xoa(int[] a) {
        System.out.print("\nNhap vi tri can xoa: ");
        Scanner sc = new Scanner(System.in);
        int vt = sc.nextInt();
        for (int i = vt; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
    }

    private static void xuat(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void them(int[] a) {
        System.out.print("\nNhap vi tri can them: ");
        Scanner sc = new Scanner(System.in);
        int vt = sc.nextInt();
        System.out.print("Nhap so them: ");
        int so = sc.nextInt();
        for (int i = n; i >= vt; i--) {
            a[i] = a[i - 1];
        }
        a[vt] = so;
        n++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        xoa(a);
        System.out.println("Mang sau khi xoa");
        xuat(a);
        them(a);
        System.out.println("Mang sau khi them");
        xuat(a);
    }
}
