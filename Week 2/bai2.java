import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        float diem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem phay cua ban: ");
        diem = sc.nextFloat();
        sc.close();
        if (diem<0 || diem > 10)
            System.out.println("Diem so khong hop le.");
        else if (diem<=3.9)
            System.out.println("Hang F");
        else if (diem <=5.9)
            System.out.println("Hang D");
        else if (diem <=7.4)
            System.out.println("Hang C");
        else if (diem <=8.4)
            System.out.println("Hang B");
        else if (diem <=10)
            System.out.println("Hang A");
    }
}