// Hoàng Tùng Lâm - KHMT1 - K12
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap so N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n/2+1;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n-(i*2);j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        
        for (int i=0;i<n/2+1;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n-(i*2);j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }

        for (int i=1;i<=n;i++){
            System.out.print(i);
        }
        System.out.printf("\n");
    }
}