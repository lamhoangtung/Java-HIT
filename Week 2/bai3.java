import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int soDien, khoang=0, tienDien=0;
        int[] khoangChia = {50, 50, 100, 100, 100};
        int[] donGia = {1484, 1533, 1786, 2242, 2503, 2587};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so kWh dien: ");
        soDien = sc.nextInt();
        sc.close();
        while (soDien>0 && khoang<6) {
            if (khoang!=5 && soDien-khoangChia[khoang]>0){
                tienDien += khoangChia[khoang]*donGia[khoang];
                soDien -= khoangChia[khoang];
            }
            else{
                tienDien += soDien*donGia[khoang];
                soDien = 0;
            }
            khoang++;
        }
        System.out.println("So tien dien phai tra la: " + tienDien + " dong.");
    }
}