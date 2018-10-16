import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String s = sc.nextLine();
        sc.close();
        System.out.println("Chuoi vua nhap la: " + s);
        System.out.println("Do dai cua chuoi la: " + s.length());
    }
}