import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int soTien, dem = 0;
        int[] menhGia = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien (nghin dong): ");
        soTien = sc.nextInt();
        sc.close();
        System.out.println("Can nhung to tien voi menh gia sau:");
        while (soTien > 0  && dem < 9) {
            int soTo = soTien/menhGia[dem];
            if (soTo > 0)
                System.out.println("    - " + soTo + " to " + menhGia[dem] + " nghin dong.");
            soTien -= soTo * menhGia[dem];
            dem++;
        }
    }
}