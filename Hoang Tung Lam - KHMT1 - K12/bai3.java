// Hoàng Tùng Lâm - KHMT1 - K12
import java.util.Scanner;

public class bai3 {

    private static int[][] nhap(int n) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap phan tu tai vi tri (" + i + ", " + j + "): ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    private static void xuat(int[][] a, int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.printf(a[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }

    private static int[][] tich(int[][] a, int[][] b, int n){
        int[][] c = new int [n][n];
        // Nhục quá em chưa kịp làm nốt hàm nhân ma trận ;_;
        return c;
    }

    public static void main(String[] args) {
        System.out.print("Nhap chieu cua ma tran: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = nhap(n);
        System.out.println("Ma tran vua nhap la: ");
        xuat(a,n);
        int TongChinh=0, TichPhu=1;
        for (int i=0;i<n;i++){
            TongChinh += a[i][i];
        }
        for (int i=0;i<n;i++){
            TichPhu *= a[i][n-1-i];
        }
        System.out.println("Tong cac gia tri tren duong cheo chinh cua ma tran la: " + TongChinh);
        System.out.println("Tich cac gia tri tren duong cheo phu cua ma tran la: " + TichPhu);

        System.out.println("Nhap ma tran vuong thu 2:");
        int[][] b=nhap(n);
        System.out.println("Ma tran da nhap la: ");
        xuat(b,n);
        System.out.println("Tich cua 2 ma tran da nhap la:");
        xuat(tich(a,b,n),n);
    }
}