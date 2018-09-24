import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao nam sinh cua ban: ");
        n = sc.nextInt();
        System.out.println("So tuoi cua ban la: " + (2018 - n));
    }
}