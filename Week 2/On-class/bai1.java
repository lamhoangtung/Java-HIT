import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String ten;
        int tuoi;
        System.out.print("Nhap ho va ten: ");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println(ten + ", " + tuoi + " tuoi.");
        sc.close();
    }
}