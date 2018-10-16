import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("Nhap chieu dai chu nhat: ");
        int m = sc.nextInt();
        System.out.print("Nhap chieu rong chu nhat: ");
        int n = sc.nextInt();
        sc.close();
        char[][] res = new char[m][n];
        int k = 0, i = 0, j = 0, l = 0, t = 0, r = n, b = m, flag = 1;
        while (k != m * n) {
            if (k >= s.length()) res[i][j] = '.';
            else res[i][j] = s.charAt(k);
            k++;
            if (flag == 1)
                if (j != r - 1) j++;
                else {
                    flag = 2;
                    i++;
                    r--;
                }
            else if (flag == 2)
                if (i != b - 1) i++;
                else {
                    flag = 3;
                    j--;
                    b--;
                }
            else if (flag == 3)
                if (j != l) j--;
                else {
                    flag = 4;
                    i--;
                    l++;
                }
            else {
                if (i != t + 1) i--;
                else {
                    flag = 1;
                    j++;
                    i = ++t;
                }
            }
        }
        System.out.println("Ma tran xoan oc: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
}