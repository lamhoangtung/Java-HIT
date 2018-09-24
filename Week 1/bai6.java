import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        n = sc.nextFloat();
        System.out.println("Can bac hai cua " + n + " la " + Math.sqrt(n));
    }
}