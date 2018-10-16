import java.util.Scanner;

public class bai6 {

    private static int[][] input(char name) {
        System.out.print("Nhap chieu dai cua ma tran " + name + ": ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Nhap chieu rong cua ma tran " + name + ": ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhap phan tu tai vi tri (" + i + ", " + j + ") cua " + name + ": ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    private static void output(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }

    public static int[][] multiplyByMatrix(int[][] a, int[][] b) {
        int aColLength = a[0].length;
        int bRowLength = b.length;
        if (aColLength != bRowLength)
            return null;
        int resRowLength = a.length;
        int resColLength = b[0].length;
        int[][] res = new int[resRowLength][resColLength];
        for (int i = 0; i < resRowLength; i++) {
            for (int j = 0; j < resColLength; j++) {
                for (int k = 0; k < aColLength; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a = input('a');
        int[][] b = input('b');
        System.out.println("Ma tran vua nhap la:");
        output(a);
        System.out.println("Va:");
        output(b);
        if (multiplyByMatrix(a, b) != null){
            System.out.println("Tich cua 2 ma tran da nhap la:");
            output(multiplyByMatrix(a, b));
        }
        else System.out.println("Hai ma tran tren khong nhan duoc voi nhau");
    }
}